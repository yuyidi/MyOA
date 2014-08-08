package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the roleright database table.
 * 
 */
@Entity
public class Roleright implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roleRightId;

	//bi-directional many-to-one association to Roleinfo
	 @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="RoleId")
	private Roleinfo roleinfo;

	//bi-directional many-to-one association to Sysfun
    @ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NodeId")
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