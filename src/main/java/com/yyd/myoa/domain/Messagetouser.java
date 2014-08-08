package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the messagetouser database table.
 * 
 */
@Entity
public class Messagetouser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int ifRead;

	//bi-directional many-to-one association to Message
    @ManyToOne
	@JoinColumn(name="MessageId")
	private Message message;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="ToUserId")
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