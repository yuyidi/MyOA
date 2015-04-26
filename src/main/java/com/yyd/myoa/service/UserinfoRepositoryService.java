package com.yyd.myoa.service;

import java.util.List;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyd.myoa.domain.Userinfo;
import com.yyd.myoa.utils.MyUtils;


@Service("userinfoRepositoryService")
public class UserinfoRepositoryService {
	
	public Userinfo getUserinfo(String userId,String password) throws UnknownAccountException,IncorrectCredentialsException{
		return null;
	}
	
	public List<Userinfo> getUserinfoList(){
	    return null;
	}
	
}
