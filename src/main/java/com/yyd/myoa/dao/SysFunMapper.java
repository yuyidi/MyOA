package com.yyd.myoa.dao;

import com.yyd.myoa.model.SysFun;

public interface SysFunMapper {
    int deleteByPrimaryKey(Integer nodeId);

    int insert(SysFun record);

    int insertSelective(SysFun record);

    SysFun selectByPrimaryKey(Integer nodeId);

    int updateByPrimaryKeySelective(SysFun record);

    int updateByPrimaryKey(SysFun record);
}