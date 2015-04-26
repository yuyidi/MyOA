package com.yyd.myoa.domain;

import java.io.Serializable;


import java.util.Set;


public class Userstate implements Serializable {
	private static final long serialVersionUID = 1L;

	private int userStateId;

	private String userStateName;

	private Set<Userinfo> userinfos;

    public Userstate() {
    }

	public int getUserStateId() {
		return this.userStateId;
	}

	public void setUserStateId(int userStateId) {
		this.userStateId = userStateId;
	}

	public String getUserStateName() {
		return this.userStateName;
	}

	public void setUserStateName(String userStateName) {
		this.userStateName = userStateName;
	}

	public Set<Userinfo> getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}
	
}