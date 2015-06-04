package com.yyd.myoa.dao;

import com.yyd.myoa.model.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Integer roleRightId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer roleRightId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}