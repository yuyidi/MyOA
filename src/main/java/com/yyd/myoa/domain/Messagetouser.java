package com.yyd.myoa.domain;

import java.io.Serializable;


/**
 * The persistent class for the messagetouser database table.
 * 
 */
public class Messagetouser implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int ifRead;

	private Message message;

	private Userinfo userinfo;

    public Messagetouser() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIfRead() {
		return this.ifRead;
	}

	public void setIfRead(int ifRead) {
		this.ifRead = ifRead;
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