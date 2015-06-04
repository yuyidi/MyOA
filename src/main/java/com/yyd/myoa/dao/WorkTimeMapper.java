package com.yyd.myoa.dao;

import com.yyd.myoa.model.WorkTime;

public interface WorkTimeMapper {
    int deleteByPrimaryKey(Integer workTimeId);

    int insert(WorkTime record);

    int insertSelective(WorkTime record);

    WorkTime selectByPrimaryKey(Integer workTimeId);

    int updateByPrimaryKeySelective(WorkTime record);

    int updateByPrimaryKey(WorkTime record);
}