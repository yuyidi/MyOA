package com.yyd.myoa.shiro;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.service.UserInfoService;


public class MyShiroRealm extends AuthorizingRealm {
	@Autowired
	private UserInfoService userInfoService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.fromRealm(getName()).iterator().next();
		if(username != null){
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//			List<Sysfun> sysFunList = sysFunRepositoryService.sysFunList();
//			if(sysFunList.size() != 0 && sysFunList != null){
//				for (Sysfun sysFun : sysFunList) {
//				    if(sysFun.getMyId() !=null && !sysFun.equals("")){
//				        info.addStringPermission(sysFun.getMyId());
//				    }
//				}
//				return info;
//			}
		}
		return null;
	}

	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken userToken = (UsernamePasswordToken) token;
		String userId = userToken.getUsername();
		String hashPassword = userInfoService.getUserPassword(userId);
		if(hashPassword == null)
			throw new UnknownAccountException("没有为 [" + userId + "] 找到用户信息");
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userId, hashPassword.toCharArray(), getName());
		return info;
	}
}
