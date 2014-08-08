package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the roleinfo database table.
 * 
 */
@Entity
public class Roleinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleId;

	private String roleDesc;

	private String roleName;

	//bi-directional many-to-one association to Roleright
	@OneToMany(mappedBy="roleinfo")
	private Set<Roleright> rolerights;

	//bi-directional many-to-one association to Userinfo
	@OneToMany(mappedBy="roleinfo")
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