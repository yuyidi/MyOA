package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the readcommonmessage database table.
 * 
 */
@Entity
public class Readcommonmessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int readId;

	//bi-directional many-to-one association to Message
    @ManyToOne
	@JoinColumn(name="MessageId")
	private Message message;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="UserId")
	private Userinfo userinfo;

    public Readcommonmessage() {
    }

	public int getReadId() {
		return this.readId;
	}

	public void setReadId(int readId) {
		this.readId = readId;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}