package com.yyd.myoa.domain;

import java.io.Serializable;


/**
 * The persistent class for the readcommonmessage database table.
 * 
 */
public class Readcommonmessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private int readId;

	private Message message;

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