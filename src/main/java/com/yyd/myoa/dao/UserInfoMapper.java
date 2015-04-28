package com.yyd.myoa.dao;

import org.apache.ibatis.annotations.Param;

import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;

public interface UserInfoMapper extends BaseMapper<UserInfo, Integer, UserInfoQuery>{
	
	String selectPasswordByUserId(String userId);
	
}