package com.yyd.myoa.service;

import java.util.List;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yyd.myoa.domain.Userinfo;
import com.yyd.myoa.repository.UserinfoRepository;
import com.yyd.myoa.utils.MyUtils;

@Transactional
@Service("userinfoRepositoryService")
public class UserinfoRepositoryService {
	@Autowired
	private UserinfoRepository userinfoRepository;
	
	public Userinfo getUserinfo(String userId,String password) throws UnknownAccountException,IncorrectCredentialsException{
		Userinfo userinfo = userinfoRepository.getUserinfo(userId);
		if(userinfo ==null){
		    //未知账户异常
		    throw new UnknownAccountException();
		}
		String loginPassword = MyUtils.getHexPassword(userId, password);
		if(loginPassword.equals(userinfo.getPassWord())){
			return userinfo;
		}else{
		    //密码错误异常
		    throw new IncorrectCredentialsException();
		}
	}
	
	public List<Userinfo> getUserinfoList(){
	    return userinfoRepository.findAll();
	}
	
}
