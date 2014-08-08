package com.yyd.myoa.shiro;

public class ShiroUser {
    private String name;
    private String password;
    
    public ShiroUser(String userName, String password) {
        this.name=userName;
        this.password=password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
