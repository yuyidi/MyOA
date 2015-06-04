package com.yyd.myoa.dao;

import com.yyd.myoa.model.AccessoryFile;

public interface AccessoryFileMapper {
    int deleteByPrimaryKey(Integer accessoryId);

    int insert(AccessoryFile record);

    int insertSelective(AccessoryFile record);

    AccessoryFile selectByPrimaryKey(Integer accessoryId);

    int updateByPrimaryKeySelective(AccessoryFile record);

    int updateByPrimaryKey(AccessoryFile record);
}