package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the loginlog database table.
 * 
 */
@Entity
public class Loginlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginId;

	private int ifSuccess;

	private String loginDesc;

    @Temporal( TemporalType.TIMESTAMP)
	private Date loginTime;

	private String loginUserIp;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="UserId")
	private Userinfo userinfo;

    public Loginlog() {
    }

	public int getLoginId() {
		return this.loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public int getIfSuccess() {
		return this.ifSuccess;
	}

	public void setIfSuccess(int ifSuccess) {
		this.ifSuccess = ifSuccess;
	}

	public String getLoginDesc() {
		return this.loginDesc;
	}

	public void setLoginDesc(String loginDesc) {
		this.loginDesc = loginDesc;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginUserIp() {
		return this.loginUserIp;
	}

	public void setLoginUserIp(String loginUserIp) {
		this.loginUserIp = loginUserIp;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}