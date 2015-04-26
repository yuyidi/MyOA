package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Set;

public class Meetinginfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int meetingId;

	private String meetingName;

	private Set<Schedule> schedules;

    public Meetinginfo() {
    }

	public int getMeetingId() {
		return this.meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingName() {
		return this.meetingName;
	}

	public void setMeetingName(String meetingName) {
		this.meetingName = meetingName;
	}

	public Set<Schedule> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}
	
}