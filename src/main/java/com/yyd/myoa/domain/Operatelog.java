package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the operatelog database table.
 * 
 */
public class Operatelog implements Serializable {
	private static final long serialVersionUID = 1L;

	private int operateId;

	private int objectId;

	private String operateDesc;

	private String operateName;

	private Date operateTime;

	private Userinfo userinfo;

    public Operatelog() {
    }

	public int getOperateId() {
		return this.operateId;
	}

	public void setOperateId(int operateId) {
		this.operateId = operateId;
	}

	public int getObjectId() {
		return this.objectId;
	}

	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	public String getOperateDesc() {
		return this.operateDesc;
	}

	public void setOperateDesc(String operateDesc) {
		this.operateDesc = operateDesc;
	}

	public String getOperateName() {
		return this.operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}