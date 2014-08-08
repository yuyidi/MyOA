package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the message database table.
 * 
 */
@Entity
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageId;

    @Temporal( TemporalType.TIMESTAMP)
	private Date beginTime;

	private String content;

    @Temporal( TemporalType.TIMESTAMP)
	private Date endTime;

	private int ifPublish;

    @Temporal( TemporalType.TIMESTAMP)
	private Date recordTime;

	private String title;

	//bi-directional many-to-one association to Messagetype
    @ManyToOne
	@JoinColumn(name="Type")
	private Messagetype messagetype;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="FromUserId")
	private Userinfo userinfo;

	//bi-directional many-to-one association to Messagetouser
	@OneToMany(mappedBy="message")
	private Set<Messagetouser> messagetousers;

	//bi-directional many-to-one association to Readcommonmessage
	@OneToMany(mappedBy="message")
	private Set<Readcommonmessage> readcommonmessages;

    public Message() {
    }

	public int getMessageId() {
		return this.messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getIfPublish() {
		return this.ifPublish;
	}

	public void setIfPublish(int ifPublish) {
		this.ifPublish = ifPublish;
	}

	public Date getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Messagetype getMessagetype() {
		return this.messagetype;
	}

	public void setMessagetype(Messagetype messagetype) {
		this.messagetype = messagetype;
	}
	
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
	public Set<Messagetouser> getMessagetousers() {
		return this.messagetousers;
	}

	public void setMessagetousers(Set<Messagetouser> messagetousers) {
		this.messagetousers = messagetousers;
	}
	
	public Set<Readcommonmessage> getReadcommonmessages() {
		return this.readcommonmessages;
	}

	public void setReadcommonmessages(Set<Readcommonmessage> readcommonmessages) {
		this.readcommonmessages = readcommonmessages;
	}
	
}