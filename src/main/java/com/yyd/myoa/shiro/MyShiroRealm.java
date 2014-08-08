package com.yyd.myoa.shiro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.constant.SystemConstant;
import com.yyd.myoa.domain.Sysfun;
import com.yyd.myoa.domain.Userinfo;
import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.exception.ValidateException;
import com.yyd.myoa.service.SysFunRepositoryService;
import com.yyd.myoa.service.UserinfoRepositoryService;


public class MyShiroRealm extends AuthorizingRealm {
	
	@Autowired
	private UserinfoRepositoryService userinfoRepositoryService;
	@Autowired
	private SysFunRepositoryService sysFunRepositoryService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.fromRealm(getName()).iterator().next();
		if(username != null){
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			List<Sysfun> sysFunList = sysFunRepositoryService.sysFunList();
			if(sysFunList.size() != 0 && sysFunList != null){
				for (Sysfun sysFun : sysFunList) {
				    if(sysFun.getMyId() !=null && !sysFun.equals("")){
				        info.addStringPermission(sysFun.getMyId());
				    }
				}
				return info;
			}
		}
		return null;
	}

	
	/**
	 * 获取验证信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken userToken = (UsernamePasswordToken) token;
		String userId = userToken.getUsername();
		String password = new String(userToken.getPassword());
		 Userinfo user = userinfoRepositoryService.getUserinfo(userId,password);
			if(user!= null){
			    Subject subject = SecurityUtils.getSubject();
                subject.getSession().setAttribute(SystemConstant.SHIRO_USER,
                        new ShiroUser(user.getUserName(), user.getPassWord()));
				return new SimpleAuthenticationInfo(userToken.getUsername(),userToken.getPassword(),getName());
			}else{
			    return null;
			}
			
	}

}
