package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the operatelog database table.
 * 
 */
@Entity
public class Operatelog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int operateId;

	private int objectId;

	private String operateDesc;

	private String operateName;

    @Temporal( TemporalType.TIMESTAMP)
	private Date operateTime;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="UserId")
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