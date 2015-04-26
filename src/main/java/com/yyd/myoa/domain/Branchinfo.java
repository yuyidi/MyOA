package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the branchinfo database table.
 * 
 */
public class Branchinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int branchId;

	private String branchName;

	private String branchShortName;

	private int ifDeleteBranch;

	private Set<Departinfo> departinfos;

    public Branchinfo() {
    }
    
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchShortName() {
		return this.branchShortName;
	}

	public void setBranchShortName(String branchShortName) {
		this.branchShortName = branchShortName;
	}

	public int getIfDeleteBranch() {
		return this.ifDeleteBranch;
	}

	public void setIfDeleteBranch(int ifDeleteBranch) {
		this.ifDeleteBranch = ifDeleteBranch;
	}

	public Set<Departinfo> getDepartinfos() {
		return this.departinfos;
	}

	public void setDepartinfos(Set<Departinfo> departinfos) {
		this.departinfos = departinfos;
	}
	
}