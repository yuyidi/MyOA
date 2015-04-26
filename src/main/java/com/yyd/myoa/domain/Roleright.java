package com.yyd.myoa.domain;

import java.io.Serializable;


/**
 * The persistent class for the roleright database table.
 * 
 */
public class Roleright implements Serializable {
	private static final long serialVersionUID = 1L;

	private int roleRightId;

	private Roleinfo roleinfo;

	private Sysfun sysfun;

    public Roleright() {
    }

	public int getRoleRightId() {
		return this.roleRightId;
	}

	public void setRoleRightId(int roleRightId) {
		this.roleRightId = roleRightId;
	}

	public Roleinfo getRoleinfo() {
		return this.roleinfo;
	}

	public void setRoleinfo(Roleinfo roleinfo) {
		this.roleinfo = roleinfo;
	}
	
	public Sysfun getSysfun() {
		return this.sysfun;
	}

	public void setSysfun(Sysfun sysfun) {
		this.sysfun = sysfun;
	}
	
}