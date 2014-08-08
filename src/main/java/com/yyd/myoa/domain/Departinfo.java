package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the departinfo database table.
 * 
 */
@Entity
public class Departinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int departId;

	private BigInteger connectMobileTelNo;

	private BigInteger connectTelNo;

	private String departName;

	private BigInteger fares;

	private int ifDeleteDepart;

	//bi-directional many-to-one association to Branchinfo
    @ManyToOne
	@JoinColumn(name="BranchId")
	private Branchinfo branchinfo;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="PrincipalUser")
	private Userinfo userinfo;

    public Departinfo() {
    }

	public int getDepartId() {
		return this.departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public BigInteger getConnectMobileTelNo() {
		return this.connectMobileTelNo;
	}

	public void setConnectMobileTelNo(BigInteger connectMobileTelNo) {
		this.connectMobileTelNo = connectMobileTelNo;
	}

	public BigInteger getConnectTelNo() {
		return this.connectTelNo;
	}

	public void setConnectTelNo(BigInteger connectTelNo) {
		this.connectTelNo = connectTelNo;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public BigInteger getFares() {
		return this.fares;
	}

	public void setFares(BigInteger fares) {
		this.fares = fares;
	}

	public int getIfDeleteDepart() {
		return this.ifDeleteDepart;
	}

	public void setIfDeleteDepart(int ifDeleteDepart) {
		this.ifDeleteDepart = ifDeleteDepart;
	}

	public Branchinfo getBranchinfo() {
		return this.branchinfo;
	}

	public void setBranchinfo(Branchinfo branchinfo) {
		this.branchinfo = branchinfo;
	}
	
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}