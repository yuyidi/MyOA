package com.yyd.myoa.model;

public class MeetingInfo {
    private Integer meetingId;

    private String mettingName;

    public Integer getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public String getMettingName() {
        return mettingName;
    }

    public void setMettingName(String mettingName) {
        this.mettingName = mettingName == null ? null : mettingName.trim();
    }
}