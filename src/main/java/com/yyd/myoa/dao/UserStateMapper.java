package com.yyd.myoa.dao;

import com.yyd.myoa.model.UserState;

public interface UserStateMapper {
    int deleteByPrimaryKey(Integer userStateId);

    int insert(UserState record);

    int insertSelective(UserState record);

    UserState selectByPrimaryKey(Integer userStateId);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}