package com.yyd.myoa.dao;

import com.yyd.myoa.model.OperateLog;

public interface OperateLogMapper {
    int deleteByPrimaryKey(Integer operateId);

    int insert(OperateLog record);

    int insertSelective(OperateLog record);

    OperateLog selectByPrimaryKey(Integer operateId);

    int updateByPrimaryKeySelective(OperateLog record);

    int updateByPrimaryKey(OperateLog record);
}