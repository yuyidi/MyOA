package com.yyd.myoa.service;


import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;


public class UserinfoServiceTest extends BaseServiceTest{
    @Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void getPassword(){
		String name = "admin";
		String password = "password";
		String loginPassword=DigestUtils.md5Hex(name+password).toLowerCase();
		System.out.println(loginPassword);
	}
	
	@Test
	public void getUser(){
		UserInfoQuery query = new UserInfoQuery();
	    Page<UserInfo> userinfo = userInfoService.getUserinfoList(query);
	    createJSONResult(userinfo);
	}
//	@Test
//	public void getUserPassword(){
//		System.out.println(userInfoService.getUserPassword("a"));
//	}
}
