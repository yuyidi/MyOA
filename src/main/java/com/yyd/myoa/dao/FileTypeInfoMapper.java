package com.yyd.myoa.dao;

import com.yyd.myoa.model.FileTypeInfo;

public interface FileTypeInfoMapper {
    int deleteByPrimaryKey(Integer fileTypeId);

    int insert(FileTypeInfo record);

    int insertSelective(FileTypeInfo record);

    FileTypeInfo selectByPrimaryKey(Integer fileTypeId);

    int updateByPrimaryKeySelective(FileTypeInfo record);

    int updateByPrimaryKey(FileTypeInfo record);
}