package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the schedule database table.
 * 
 */
@Entity
public class Schedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scheduleId;

	private String address;

    @Temporal( TemporalType.TIMESTAMP)
	private Date beginTime;

    @Temporal( TemporalType.TIMESTAMP)
	private Date createTime;

	private String createUser;

    @Temporal( TemporalType.TIMESTAMP)
	private Date endTime;

	private int ifPrivate;

	private String schContent;

	private String title;

	//bi-directional many-to-one association to Precontract
	@OneToMany(mappedBy="schedule")
	private Set<Precontract> precontracts;

	//bi-directional many-to-one association to Meetinginfo
    @ManyToOne
	@JoinColumn(name="MeetingId")
	private Meetinginfo meetinginfo;

    public Schedule() {
    }

	public int getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getIfPrivate() {
		return this.ifPrivate;
	}

	public void setIfPrivate(int ifPrivate) {
		this.ifPrivate = ifPrivate;
	}

	public String getSchContent() {
		return this.schContent;
	}

	public void setSchContent(String schContent) {
		this.schContent = schContent;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Precontract> getPrecontracts() {
		return this.precontracts;
	}

	public void setPrecontracts(Set<Precontract> precontracts) {
		this.precontracts = precontracts;
	}
	
	public Meetinginfo getMeetinginfo() {
		return this.meetinginfo;
	}

	public void setMeetinginfo(Meetinginfo meetinginfo) {
		this.meetinginfo = meetinginfo;
	}
	
}