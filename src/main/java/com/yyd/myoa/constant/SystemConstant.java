package com.yyd.myoa.constant;


import org.apache.shiro.subject.Subject;

import com.yyd.myoa.shiro.ShiroUser;

public class SystemConstant {
	
	public static final String SUBJECT_TITLE="My_OA，我的办公OA";
	
//	session 中管理员的Key
	public static final String SYSTEM_ADMIN="SYSTEM_ADMIN";
	public static final String SHIRO_USER="shiroUser";
    public static final String UNKNOWN_ACCOUNT_EXCEPTION = "账号错误!";
    public static final String INCORRECT_CREDENTIALS_EXCEPTION = "密码错误!";
    public static final String LOCKED_ACCOUNT_EXCEPTION = "账号已被锁定，请与系统管理员联系!";
    public static final String AUTHENTICATION_EXCEPTION = "您没有授权!";
    
    
    public static ShiroUser getShiroUser(Subject subject){
        return (ShiroUser) subject.getPrincipals();
    }
}
