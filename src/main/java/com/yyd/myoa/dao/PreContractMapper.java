package com.yyd.myoa.dao;

import com.yyd.myoa.model.PreContract;

public interface PreContractMapper {
    int deleteByPrimaryKey(Integer preContractId);

    int insert(PreContract record);

    int insertSelective(PreContract record);

    PreContract selectByPrimaryKey(Integer preContractId);

    int updateByPrimaryKeySelective(PreContract record);

    int updateByPrimaryKey(PreContract record);
}