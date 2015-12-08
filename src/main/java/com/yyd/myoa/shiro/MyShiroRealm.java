package com.yyd.myoa.shiro;


import java.util.Map;

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
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.service.UserInfoService;


public class MyShiroRealm extends AuthorizingRealm {
	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 授权：获取用户角色信息，并绑定到认证对象中，后通过角色获取权限集合(资源：操作)
	 */
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

	/**
	 * 认证：
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken userToken = (UsernamePasswordToken) token;
		String userId = userToken.getUsername();
		Map<String, String> hashPassword = userInfoService.getUserPassword(userId);
		if(hashPassword == null)
			throw new UnknownAccountException("没有为 [" + userId + "] 找到用户信息");
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userId, hashPassword.get("password").toCharArray(), getName());
		info.setCredentialsSalt(ByteSource.Util.bytes(hashPassword.get("salt")));
		return info;
	}
}
