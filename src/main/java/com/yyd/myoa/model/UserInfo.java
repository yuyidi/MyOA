package com.yyd.myoa.model;

public class UserInfo {
    private String userId;

    private String userName;

    private String password;

    private Integer departId;

    private Integer gender;

    private Integer roleId;

    private Integer userState;

    private Integer ifDeleteUser;

    private String userPricter;

    public String getUserId() {
        return userId;
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
}