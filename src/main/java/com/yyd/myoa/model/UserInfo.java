package com.yyd.myoa.model;

import java.io.Serializable;

public class UserInfo implements Serializable{
    private String userId;

    private String userName;

    private String password;
    
    private String salt;

    private String email;

    private Integer departId;

    private Integer gender;

    private Integer roleId;
    //TODO 使用枚举
    private Integer userState;

    private Integer ifDeleteUser;

    private String userPricter;

    private String actiCode;

    private String actiCodeName;

    public String getUserId() {
        return userId;
    }
    
    public UserInfo() {
	}

    public UserInfo(String userId, String userName, String password,String salt,
			String email, Integer departId, Integer gender, Integer roleId,
			Integer userState, Integer ifDeleteUser, String userPricter,
			String actiCode, String actiCodeName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.salt= salt;
		this.email = email;
		this.departId = departId;
		this.gender = gender;
		this.roleId = roleId;
		this.userState = userState;
		this.ifDeleteUser = ifDeleteUser;
		this.userPricter = userPricter;
		this.actiCode = actiCode;
		this.actiCodeName = actiCodeName;
	}


	public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getIfDeleteUser() {
        return ifDeleteUser;
    }

    public void setIfDeleteUser(Integer ifDeleteUser) {
        this.ifDeleteUser = ifDeleteUser;
    }

    public String getUserPricter() {
        return userPricter;
    }

    public void setUserPricter(String userPricter) {
        this.userPricter = userPricter == null ? null : userPricter.trim();
    }

    public String getActiCode() {
        return actiCode;
    }

    public void setActiCode(String actiCode) {
        this.actiCode = actiCode == null ? null : actiCode.trim();
    }

    public String getActiCodeName() {
        return actiCodeName;
    }

    public void setActiCodeName(String actiCodeName) {
        this.actiCodeName = actiCodeName == null ? null : actiCodeName.trim();
    }
}