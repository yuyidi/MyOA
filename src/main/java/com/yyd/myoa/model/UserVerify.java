package com.yyd.myoa.model;

public class UserVerify {
    private String userId;

    private String actiCode;

    private String actiNameCode;

    public UserVerify(String userId, String actiCode, String actiNameCode) {
		this.userId = userId;
		this.actiCode = actiCode;
		this.actiNameCode = actiNameCode;
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getActiCode() {
        return actiCode;
    }

    public void setActiCode(String actiCode) {
        this.actiCode = actiCode == null ? null : actiCode.trim();
    }

    public String getActiNameCode() {
        return actiNameCode;
    }

    public void setActiNameCode(String actiNameCode) {
        this.actiNameCode = actiNameCode == null ? null : actiNameCode.trim();
    }
}