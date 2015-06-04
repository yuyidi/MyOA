package com.yyd.myoa.dao;

import com.yyd.myoa.model.DepartInfo;

public interface DepartInfoMapper {
    int deleteByPrimaryKey(Integer departId);

    int insert(DepartInfo record);

    int insertSelective(DepartInfo record);

    DepartInfo selectByPrimaryKey(Integer departId);

    int updateByPrimaryKeySelective(DepartInfo record);

    int updateByPrimaryKey(DepartInfo record);
}