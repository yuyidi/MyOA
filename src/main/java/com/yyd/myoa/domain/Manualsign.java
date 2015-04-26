package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the manualsign database table.
 * 
 */
public class Manualsign implements Serializable {
	private static final long serialVersionUID = 1L;

	private int signId;

	private String signDesc;

	private int signTag;

	private Date signTime;

	private Userinfo userinfo;

    public Manualsign() {
    }

	public int getSignId() {
		return this.signId;
	}

	public void setSignId(int signId) {
		this.signId = signId;
	}

	public String getSignDesc() {
		return this.signDesc;
	}

	public void setSignDesc(String signDesc) {
		this.signDesc = signDesc;
	}

	public int getSignTag() {
		return this.signTag;
	}

	public void setSignTag(int signTag) {
		this.signTag = signTag;
	}

	public Date getSignTime() {
		return this.signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}