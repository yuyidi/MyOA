package com.yyd.myoa.shiro;

import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.RolePermissionResolver;

/**
 * 
* @ClassName: com.yyd.myoa.shiro 
* @Description: 角色权限解析 
* @author yuyidi0630@163.com 
* @date 2015年11月10日 下午4:51:05
 */
public class RolePermissions implements RolePermissionResolver {
	
	@Override
	public Collection<Permission> resolvePermissionsInRole(String roleString) {
		//从数据库中根据角色名称获取相应的权限信息
		return null;
	}
}
