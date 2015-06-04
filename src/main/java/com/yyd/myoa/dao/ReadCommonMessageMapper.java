package com.yyd.myoa.dao;

import com.yyd.myoa.model.ReadCommonMessage;

public interface ReadCommonMessageMapper {
    int deleteByPrimaryKey(Integer readId);

    int insert(ReadCommonMessage record);

    int insertSelective(ReadCommonMessage record);

    ReadCommonMessage selectByPrimaryKey(Integer readId);

    int updateByPrimaryKeySelective(ReadCommonMessage record);

    int updateByPrimaryKey(ReadCommonMessage record);
}