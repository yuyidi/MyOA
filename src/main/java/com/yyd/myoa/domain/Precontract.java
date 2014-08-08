package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the precontract database table.
 * 
 */
@Entity
public class Precontract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int preContractId;

	//bi-directional many-to-one association to Schedule
    @ManyToOne
	@JoinColumn(name="ScheduleId")
	private Schedule schedule;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="UserId")
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