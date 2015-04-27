package com.yyd.myoa.service;


import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.model.UserInfo;


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
	    List<UserInfo> userinfo = userInfoService.getUserinfoList();
	    createJSONResult(userinfo);
	}
}
