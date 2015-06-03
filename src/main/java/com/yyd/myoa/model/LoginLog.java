package com.yyd.myoa.model;

import java.util.Date;

public class LoginLog {
    private Integer loginId;

    private String userId;

    private Date loginTime;

    private Integer ifSuccess;

    private String loginUserIp;

    private String loginDesc;
    

    public LoginLog(String userId, Date loginTime, Integer ifSuccess,
			String loginUserIp, String loginDesc) {
		this.userId = userId;
		this.loginTime = loginTime;
		this.ifSuccess = ifSuccess;
		this.loginUserIp = loginUserIp;
		this.loginDesc = loginDesc;
	}

	public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getIfSuccess() {
        return ifSuccess;
    }

    public void setIfSuccess(Integer ifSuccess) {
        this.ifSuccess = ifSuccess;
    }

    public String getLoginUserIp() {
        return loginUserIp;
    }

    public void setLoginUserIp(String loginUserIp) {
        this.loginUserIp = loginUserIp == null ? null : loginUserIp.trim();
    }

    public String getLoginDesc() {
        return loginDesc;
    }

    public void setLoginDesc(String loginDesc) {
        this.loginDesc = loginDesc == null ? null : loginDesc.trim();
    }
}