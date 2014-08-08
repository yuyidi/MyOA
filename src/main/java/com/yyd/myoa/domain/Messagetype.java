package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the messagetype database table.
 * 
 */
@Entity
public class Messagetype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int messageTypeId;

	private String messageDesc;

	private String messageTypeName;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="messagetype")
	private Set<Message> messages;

    public Messagetype() {
    }

	public int getMessageTypeId() {
		return this.messageTypeId;
	}

	public void setMessageTypeId(int messageTypeId) {
		this.messageTypeId = messageTypeId;
	}

	public String getMessageDesc() {
		return this.messageDesc;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getMessageTypeName() {
		return this.messageTypeName;
	}

	public void setMessageTypeName(String messageTypeName) {
		this.messageTypeName = messageTypeName;
	}

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
}