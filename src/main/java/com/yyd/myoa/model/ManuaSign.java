package com.yyd.myoa.model;

import java.util.Date;

public class ManuaSign {
    private Integer signId;

    private String userId;

    private Date signTime;

    private String signDesc;

    private Integer signTag;

    public Integer getSignId() {
        return signId;
    }

    public void setSignId(Integer signId) {
        this.signId = signId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getSignDesc() {
        return signDesc;
    }

    public void setSignDesc(String signDesc) {
        this.signDesc = signDesc == null ? null : signDesc.trim();
    }

    public Integer getSignTag() {
        return signTag;
    }

    public void setSignTag(Integer signTag) {
        this.signTag = signTag;
    }
}