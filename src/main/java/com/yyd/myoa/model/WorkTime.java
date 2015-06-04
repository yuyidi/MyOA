package com.yyd.myoa.model;

public class WorkTime {
    private Integer workTimeId;

    private String onDutyTime;

    private String offDutyTime;

    public Integer getWorkTimeId() {
        return workTimeId;
    }

    public void setWorkTimeId(Integer workTimeId) {
        this.workTimeId = workTimeId;
    }

    public String getOnDutyTime() {
        return onDutyTime;
    }

    public void setOnDutyTime(String onDutyTime) {
        this.onDutyTime = onDutyTime == null ? null : onDutyTime.trim();
    }

    public String getOffDutyTime() {
        return offDutyTime;
    }

    public void setOffDutyTime(String offDutyTime) {
        this.offDutyTime = offDutyTime == null ? null : offDutyTime.trim();
    }
}