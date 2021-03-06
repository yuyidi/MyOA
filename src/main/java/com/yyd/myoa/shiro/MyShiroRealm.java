package com.yyd.myoa.shiro;


import java.util.Map;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.service.UserInfoService;


public class MyShiroRealm extends AuthorizingRealm {
	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 授权：获取用户角色信息，并绑定到认证对象中，后通过角色获取权限集合(资源：操作)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		principals.getPrimaryPrincipal();
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
		UserInfo userInfo = userInfoService.getUserInfo(userId);
		if(userInfo == null)
			throw new UnknownAccountException("没有为 [" + userId + "] 找到用户信息");
		//TODO 被屏蔽状态用户抛出账户锁定异常  后期使用枚举
		if(userInfo.getUserState().equals(1)){
			throw new LockedAccountException();
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userInfo.getUserId(), userInfo.getPassword().toCharArray(), getName());
		info.setCredentialsSalt(ByteSource.Util.bytes(userInfo.getSalt()));
		return info;
	}
}
