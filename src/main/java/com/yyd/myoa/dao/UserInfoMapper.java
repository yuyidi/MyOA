package com.yyd.myoa.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;

public interface UserInfoMapper extends BaseMapper<UserInfo, String, UserInfoQuery>{
	//登录验证密码
	UserInfo selectUserInfoByUserId(String userId);
	UserInfo selectUserInfoByUserEmail(String email);
	//根据用户id更改用户状态
	Integer updateUserState(@Param("userState")Integer userState,@Param("userId")String userId);
}