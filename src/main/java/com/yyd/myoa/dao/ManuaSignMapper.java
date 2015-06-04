package com.yyd.myoa.dao;

import com.yyd.myoa.model.ManuaSign;

public interface ManuaSignMapper {
    int deleteByPrimaryKey(Integer signId);

    int insert(ManuaSign record);

    int insertSelective(ManuaSign record);

    ManuaSign selectByPrimaryKey(Integer signId);

    int updateByPrimaryKeySelective(ManuaSign record);

    int updateByPrimaryKey(ManuaSign record);
}