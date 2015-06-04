package com.yyd.myoa.model;

public class PreContract {
    private Integer preContractId;

    private Integer scheduleId;

    private String userId;

    public Integer getPreContractId() {
        return preContractId;
    }

    public void setPreContractId(Integer preContractId) {
        this.preContractId = preContractId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}