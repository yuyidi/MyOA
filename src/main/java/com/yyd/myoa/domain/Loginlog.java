package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the loginlog database table.
 * 
 */
public class Loginlog implements Serializable {
	private static final long serialVersionUID = 1L;

	private int loginId;

	private int ifSuccess;

	private String loginDesc;

	private Date loginTime;

	private String loginUserIp;

	private Userinfo userinfo;

    public Loginlog() {
    }

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public int getIfSuccess() {
		return this.ifSuccess;
	}

	public void setIfSuccess(int ifSuccess) {
		this.ifSuccess = ifSuccess;
	}

	public String getLoginDesc() {
		return this.loginDesc;
	}

	public void setLoginDesc(String loginDesc) {
		this.loginDesc = loginDesc;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginUserIp() {
		return this.loginUserIp;
	}

	public void setLoginUserIp(String loginUserIp) {
		this.loginUserIp = loginUserIp;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}