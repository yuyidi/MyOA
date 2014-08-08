package com.yyd.myoa.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the userinfo database table.
 * 
 */ 
@Entity
public class Userinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userId;

	private int departId;

	private int gender;

	private int ifDeleteUser;

	private String passWord;

	private String userName;
	
	private String userPricter;

	//bi-directional many-to-one association to Departinfo
	@OneToMany(mappedBy="userinfo",fetch=FetchType.EAGER)
	private Set<Departinfo> departinfos;

	//bi-directional many-to-one association to Loginlog
	@OneToMany(mappedBy="userinfo")
	private Set<Loginlog> loginlogs;

	//bi-directional many-to-one association to Manualsign
	@OneToMany(mappedBy="userinfo")
	private Set<Manualsign> manualsigns;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="userinfo")
	private Set<Message> messages;

	//bi-directional many-to-one association to Messagetouser
	@OneToMany(mappedBy="userinfo")
	private Set<Messagetouser> messagetousers;

	//bi-directional many-to-one association to Mynote
	@OneToMany(mappedBy="userinfo")
	private Set<Mynote> mynotes;

	//bi-directional many-to-one association to Operatelog
	@OneToMany(mappedBy="userinfo")
	private Set<Operatelog> operatelogs;

	//bi-directional many-to-one association to Precontract
	@OneToMany(mappedBy="userinfo")
	private Set<Precontract> precontracts;

	//bi-directional many-to-one association to Readcommonmessage
	@OneToMany(mappedBy="userinfo")
	private Set<Readcommonmessage> readcommonmessages;

	//bi-directional many-to-one association to Roleinfo
    @ManyToOne
	@JoinColumn(name="RoleId")
	private Roleinfo roleinfo;

	//bi-directional many-to-one association to Userstate
    @ManyToOne
	@JoinColumn(name="UserState")
	private Userstate userstate;

    public Userinfo() {
    }

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getDepartId() {
		return this.departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public int getGender() {
		return this.gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getIfDeleteUser() {
		return this.ifDeleteUser;
	}

	public void setIfDeleteUser(int ifDeleteUser) {
		this.ifDeleteUser = ifDeleteUser;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPricter() {
		return this.userPricter;
	}

	public void setUserPricter(String userPricter) {
		this.userPricter = userPricter;
	}

	public Set<Departinfo> getDepartinfos() {
		return this.departinfos;
	}

	public void setDepartinfos(Set<Departinfo> departinfos) {
		this.departinfos = departinfos;
	}
	
	public Set<Loginlog> getLoginlogs() {
		return this.loginlogs;
	}

	public void setLoginlogs(Set<Loginlog> loginlogs) {
		this.loginlogs = loginlogs;
	}
	
	public Set<Manualsign> getManualsigns() {
		return this.manualsigns;
	}

	public void setManualsigns(Set<Manualsign> manualsigns) {
		this.manualsigns = manualsigns;
	}
	
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
	public Set<Messagetouser> getMessagetousers() {
		return this.messagetousers;
	}

	public void setMessagetousers(Set<Messagetouser> messagetousers) {
		this.messagetousers = messagetousers;
	}
	
	public Set<Mynote> getMynotes() {
		return this.mynotes;
	}

	public void setMynotes(Set<Mynote> mynotes) {
		this.mynotes = mynotes;
	}
	
	public Set<Operatelog> getOperatelogs() {
		return this.operatelogs;
	}

	public void setOperatelogs(Set<Operatelog> operatelogs) {
		this.operatelogs = operatelogs;
	}
	
	public Set<Precontract> getPrecontracts() {
		return this.precontracts;
	}

	public void setPrecontracts(Set<Precontract> precontracts) {
		this.precontracts = precontracts;
	}
	
	public Set<Readcommonmessage> getReadcommonmessages() {
		return this.readcommonmessages;
	}

	public void setReadcommonmessages(Set<Readcommonmessage> readcommonmessages) {
		this.readcommonmessages = readcommonmessages;
	}
	
	public Roleinfo getRoleinfo() {
		return this.roleinfo;
	}

	public void setRoleinfo(Roleinfo roleinfo) {
		this.roleinfo = roleinfo;
	}
	
	public Userstate getUserstate() {
		return this.userstate;
	}

	public void setUserstate(Userstate userstate) {
		this.userstate = userstate;
	}
	
}