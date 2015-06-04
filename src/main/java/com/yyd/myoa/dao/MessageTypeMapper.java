package com.yyd.myoa.dao;

import com.yyd.myoa.model.MessageType;

public interface MessageTypeMapper {
    int deleteByPrimaryKey(Integer messageTypeId);

    int insert(MessageType record);

    int insertSelective(MessageType record);

    MessageType selectByPrimaryKey(Integer messageTypeId);

    int updateByPrimaryKeySelective(MessageType record);

    int updateByPrimaryKey(MessageType record);
}