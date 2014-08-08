package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the manualsign database table.
 * 
 */
@Entity
public class Manualsign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int signId;

	private String signDesc;

	private int signTag;

    @Temporal( TemporalType.TIMESTAMP)
	private Date signTime;

	//bi-directional many-to-one association to Userinfo
    @ManyToOne
	@JoinColumn(name="UserId")
	private Userinfo userinfo;

    public Manualsign() {
    }

	public int getSignId() {
		return this.signId;
	}

	public void setSignId(int signId) {
		this.signId = signId;
	}

	public String getSignDesc() {
		return this.signDesc;
	}

	public void setSignDesc(String signDesc) {
		this.signDesc = signDesc;
	}

	public int getSignTag() {
		return this.signTag;
	}

	public void setSignTag(int signTag) {
		this.signTag = signTag;
	}

	public Date getSignTime() {
		return this.signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}