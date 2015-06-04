package com.yyd.myoa.dao;

import com.yyd.myoa.model.MessageToUser;

public interface MessageToUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageToUser record);

    int insertSelective(MessageToUser record);

    MessageToUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageToUser record);

    int updateByPrimaryKey(MessageToUser record);
}