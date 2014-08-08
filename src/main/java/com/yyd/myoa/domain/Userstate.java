package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Set;


/**
 * The persistent class for the userstate database table.
 * 
 */
@Entity
public class Userstate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userStateId;

	private String userStateName;

	//bi-directional many-to-one association to Userinfo
	@OneToMany(mappedBy="userstate")
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