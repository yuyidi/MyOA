package com.yyd.myoa.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.codec.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.yyd.myoa.constant.SystemConstant;
import com.yyd.myoa.dao.LoginLogMapper;
import com.yyd.myoa.dao.UserInfoMapper;
import com.yyd.myoa.dao.UserVerifyMapper;
import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.model.LoginLog;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.model.UserVerify;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.utils.HttpUtils;
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
	@Autowired
	private LoginLogMapper loginLogMapper;
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
		return password;
	}

	public Page<UserInfo> getUserinfos(UserInfoQuery query) {
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
		String random = passwordService.encryptPassword(num);//使用SHA-512算法将随机数加密
		String userActiCode = passwordService.encryptPassword(userInfo.getUserName());//使用SHA-512算法将用户真实姓名加密
		userInfo.setActiCode(random);
		userInfo.setActiCodeName(userActiCode);
		//将SHA-512算法加密后的数据使用base64算法加密
		String encodeUserActiCode = Base64.encodeToString(userActiCode.getBytes());
		String encodeRandom=Base64.encodeToString(random.getBytes());
		String result = "邮件未发送成功";
		try {
			int res = userInfoMapper.insertSelective(userInfo);
			UserVerify uv = new UserVerify(userInfo.getUserId(),
					random,userActiCode);
			if (res > 0) {
				userVerifyMapper.insert(uv);
				String content ="<html><head><meta http-equiv="+"Content-Type"+" content="+"text/html; charset=utf-8"+"></head><body><h2>请点击下面链接完成注册</h2><a href="+contextPath+"/user-info/verify?userActiCode="+encodeUserActiCode+"&random="+encodeRandom+">"+  
				        contextPath+"/user-info/verify?userActiCode="+encodeUserActiCode+"&random="+encodeRandom+"</a><br></body></html>";
				mail.sendMail(SystemConstant.SUBJECT_TITLE, content, userInfo.getEmail());
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
		String userId=userVerifyMapper.selectVerifyByCode(Base64.decodeToString(actiCode), Base64.decodeToString(actiNameCode));
		if(userId != null){
			int res=0;
			try {
				res = userInfoMapper.updateUserState(2, userId);
				if(res>0){
					userVerifyMapper.deleteByPrimaryKey(userId);
				}
			} catch (Exception e) {
				throw ServiceException.userRegisterError(e);
			}
		}else{
			throw new ServiceException("你已注册或请先输入注册信息");
		}
	}
	
	/**
	 * 
	* @Title: loginLog
	* @Description: 用户登录日志
	* @return void
	* @throws
	 */
	public void loginLog(LoginLog log){
		loginLogMapper.insert(log);
	}
	
	public void addTest(){
	    loginLogMapper.insert(new LoginLog("yuyidi",new Date(),1,"127.0.0.1","test"));
	    throw new ServiceException(ServiceException.USER_LOGIN_ERROR);
	}
}
