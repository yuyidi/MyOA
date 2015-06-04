package com.yyd.myoa.dao;

import com.yyd.myoa.model.MeetingInfo;

public interface MeetingInfoMapper {
    int deleteByPrimaryKey(Integer meetingId);

    int insert(MeetingInfo record);

    int insertSelective(MeetingInfo record);

    MeetingInfo selectByPrimaryKey(Integer meetingId);

    int updateByPrimaryKeySelective(MeetingInfo record);

    int updateByPrimaryKey(MeetingInfo record);
}