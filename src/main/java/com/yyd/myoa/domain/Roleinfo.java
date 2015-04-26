package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Set;


public class Roleinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int roleId;

	private String roleDesc;

	private String roleName;

	private Set<Roleright> rolerights;

	private Set<Userinfo> userinfos;

    public Roleinfo() {
    }

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<Roleright> getRolerights() {
		return this.rolerights;
	}

	public void setRolerights(Set<Roleright> rolerights) {
		this.rolerights = rolerights;
	}
	
	public Set<Userinfo> getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set<Userinfo> userinfos) {
		this.userinfos = userinfos;
	}
	
}