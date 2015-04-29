package com.yyd.myoa.dao;

import org.apache.ibatis.annotations.Param;

import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;

public interface UserInfoMapper extends BaseMapper<UserInfo, String, UserInfoQuery>{
	//登录验证密码
	String selectPasswordByUserId(String userId);
	//根据用户id更改用户状态
	Integer updateUserState(@Param("state")Integer state,@Param("userId")String userId);
}