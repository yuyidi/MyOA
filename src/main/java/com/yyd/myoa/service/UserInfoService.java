package com.yyd.myoa.service;

import java.util.List;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyd.myoa.dao.UserInfoMapper;
import com.yyd.myoa.model.UserInfo;


@Service
public class UserInfoService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserinfo(String userId,String password) throws UnknownAccountException,IncorrectCredentialsException{
		return null;
	}
	
	public List<UserInfo> getUserinfoList(){
	    return userInfoMapper.select();
	}
	
}
