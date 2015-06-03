package com.yyd.myoa.dao;

import com.yyd.myoa.model.LoginLog;

public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    LoginLog selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}