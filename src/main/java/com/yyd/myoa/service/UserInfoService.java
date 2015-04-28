package com.yyd.myoa.service;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.yyd.myoa.dao.UserInfoMapper;
import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;


@Service
public class UserInfoService extends BaseService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Resource(name="passwordService")
	private PasswordService passwordService;
	
	public String getUserPassword(String userId){
		String password = userInfoMapper.selectPasswordByUserId(userId);
		if(password == null){
			throw new UnknownAccountException("没有为 [" + userId + "] 找到账户信息");
		}
		return password;
	}
	
	public Page<UserInfo> getUserinfoList(UserInfoQuery query){
		PageList<UserInfo> pageList =(PageList<UserInfo>)userInfoMapper.selectByQuery(query, createPageBounds(query));
		Page<UserInfo> page = new Page<UserInfo>(pageList);
	    return page;
	}
	
	public Integer registerUser(UserInfo userInfo) throws ServiceException{
		userInfo.setPassword(passwordService.encryptPassword(userInfo.getPassword()));
		try {
			Integer result = userInfoMapper.insertSelective(userInfo);
			return result;
		} catch (Exception e) {
			throw ServiceException.userAddError(e);
		}
	}
}
