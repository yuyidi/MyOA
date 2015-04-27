package com.yyd.myoa.service;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.yyd.myoa.dao.UserInfoMapper;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;


@Service
public class UserInfoService extends BaseService {
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserinfo(String userId,String password) throws UnknownAccountException,IncorrectCredentialsException{
		return null;
	}
	
	public Page<UserInfo> getUserinfoList(UserInfoQuery query){
		PageList<UserInfo> pageList =(PageList<UserInfo>)userInfoMapper.selectByQuery(query, createPageBounds(query));
		Page<UserInfo> page = new Page<UserInfo>(pageList);
	    return page;
	}
}
