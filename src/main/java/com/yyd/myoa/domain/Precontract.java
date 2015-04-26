package com.yyd.myoa.domain;

import java.io.Serializable;


/**
 * The persistent class for the precontract database table.
 * 
 */
public class Precontract implements Serializable {
	private static final long serialVersionUID = 1L;

	private int preContractId;

	//bi-directional many-to-one association to Schedule
	private Schedule schedule;

	private Userinfo userinfo;

    public Precontract() {
    }

	public int getPreContractId() {
		return this.preContractId;
	}

	public void setPreContractId(int preContractId) {
		this.preContractId = preContractId;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}