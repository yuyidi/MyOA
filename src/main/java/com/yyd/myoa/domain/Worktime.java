package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the worktime database table.
 * 
 */
@Entity
public class Worktime implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int workTimeId;

	private String offDutyTime;

	private String onDutyTime;

    public Worktime() {
    }

	public int getWorkTimeId() {
		return this.workTimeId;
	}

	public void setWorkTimeId(int workTimeId) {
		this.workTimeId = workTimeId;
	}

	public String getOffDutyTime() {
		return this.offDutyTime;
	}

	public void setOffDutyTime(String offDutyTime) {
		this.offDutyTime = offDutyTime;
	}

	public String getOnDutyTime() {
		return this.onDutyTime;
	}

	public void setOnDutyTime(String onDutyTime) {
		this.onDutyTime = onDutyTime;
	}

}