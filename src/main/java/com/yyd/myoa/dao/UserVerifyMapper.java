package com.yyd.myoa.dao;

import com.yyd.myoa.model.UserVerify;

public interface UserVerifyMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserVerify record);

    int insertSelective(UserVerify record);

    UserVerify selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserVerify record);

    int updateByPrimaryKey(UserVerify record);
    
    String selectVerifyByCode(String actiCode,String actiNameCode);
}