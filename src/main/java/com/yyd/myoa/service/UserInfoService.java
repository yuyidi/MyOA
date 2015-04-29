package com.yyd.myoa.service;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.yyd.myoa.constant.SystemConstant;
import com.yyd.myoa.dao.UserInfoMapper;
import com.yyd.myoa.dao.UserVerifyMapper;
import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.model.UserVerify;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.utils.Mail;
import com.yyd.myoa.utils.MyUtils;

@Service
public class UserInfoService extends BaseService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Resource(name = "passwordService")
	private PasswordService passwordService;
	@Autowired
	private UserVerifyMapper userVerifyMapper;
	@Resource(name="simpleMail")
	private Mail mail;

	/**
	 * 
	* @Title: getUserPassword
	* @Description: 登录，根据查询的用户名查询用户密码
	* @return String
	* @throws
	 */
	public String getUserPassword(String userId) {
		String password = userInfoMapper.selectPasswordByUserId(userId);
		if (password == null) {
			throw new UnknownAccountException("没有未 [" + userId + "] 用户找到账户信息");
		}
		return password;
	}

	public Page<UserInfo> getUserinfoList(UserInfoQuery query) {
		PageList<UserInfo> pageList = (PageList<UserInfo>) userInfoMapper
				.selectByQuery(query, createPageBounds(query));
		Page<UserInfo> page = new Page<UserInfo>(pageList);
		return page;
	}

	/**
	 * 
	* @Title: registerUser
	* @Description: 注册用户，添加用户信息入库后将用户的加密后的用户名与随机产生加密数据存到通知表中,并发送邮件
	* @return String
	* @throws
	 */
	public String registerUser(UserInfo userInfo,String contextPath) throws ServiceException {
		userInfo.setPassword(passwordService.encryptPassword(userInfo
				.getPassword()));
		String num = String.valueOf(MyUtils.getIntRandom());
		String random = passwordService.encryptPassword(num);
		String userActiCode = passwordService.encryptPassword(userInfo.getUserName());
		userInfo.setActiCode(random);
		userInfo.setActiCodeName(userActiCode);
		String result = "邮件未发送成功";
		try {
			int res = userInfoMapper.insertSelective(userInfo);
			UserVerify uv = new UserVerify(userInfo.getUserId(),
					random,userActiCode);
			if (res > 0) {
				userVerifyMapper.insert(uv);
//				String content="</h4>请点击下面链接完成注册</h4><br/><a href="+contextPath+"/user-info/verify?userActiCode="+userActiCode+"&random="+random+"\">" +
//						contextPath+"/user-info/verify?userActiCode="+userActiCode+"&random="+random+"</a>";
				StringBuffer content = new StringBuffer();
				content.append("</h4>请点击下面链接完成注册</h4><br/>");
				content.append("<a>");
				mail.sendMail(SystemConstant.SUBJECT_TITLE, content.toString(), userInfo.getEmail());
				result ="邮件已发送到你的邮箱，请确认完成注册";
			}
		} catch (Exception e) {
			throw ServiceException.userRegisterError(e);
		}
		return result;
	}
	
	/**
	 * 
	* @Title: verify
	* @Description: 注册验证通知
	* @return String
	* @throws
	 */
	public void verify(String actiCode,String actiNameCode) throws ServiceException{
		String userId=userVerifyMapper.selectVerifyByCode(actiCode, actiNameCode);
		if(userId != null){
			int res=0;
			try {
				res = userInfoMapper.updateUserState(1, userId);
				if(res>0){
					userVerifyMapper.deleteByPrimaryKey(userId);
				}
			} catch (Exception e) {
				throw ServiceException.userRegisterError(e);
			}
		}
	}
}
