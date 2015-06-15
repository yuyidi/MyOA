package com.yyd.myoa.redis;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.yyd.myoa.model.UserInfo;

@Component
public class UserInfoRedis extends AbstractRedis<UserInfo,String, Serializable> {
	
}
