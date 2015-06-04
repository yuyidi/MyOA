package com.yyd.myoa.interceptor;

import java.util.Date;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yyd.myoa.model.LoginLog;
import com.yyd.myoa.service.UserInfoService;
import com.yyd.myoa.utils.HttpUtils;

/**
 * 
 * @ClassName: AuthcFormAuthenticationFilter
 * @Description: 解决登录成功后自动跳转问题
 * @author yuyidi
 * @date 2015年4月28日 下午2:26:54*
 */
public class AuthcFormAuthenticationFilter extends FormAuthenticationFilter {
	Logger log = LoggerFactory.getLogger(AuthcFormAuthenticationFilter.class);
	private UserInfoService userInfoService;
	@Override
	protected boolean onLoginSuccess(AuthenticationToken token,
			Subject subject, ServletRequest request, ServletResponse response)
			throws Exception {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		userInfoService.loginLog(new LoginLog(subject.getPrincipal().toString(), new Date(), 1, HttpUtils.getIp(httpServletRequest), "登录成功"));
		String url = this.getSuccessUrl();
		log.info("成功登录后的请求地址：" + url);
		httpServletResponse.sendRedirect(httpServletRequest.getContextPath()
				+ url);
		return false;
	}

	@Override
	protected boolean onLoginFailure(AuthenticationToken token,
			AuthenticationException e, ServletRequest request,
			ServletResponse response) {
		log.debug("登录失败将日志信息保存");
		return super.onLoginFailure(token, e, request, response);
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		return super.onAccessDenied(request, response);
	}

	public void setUsernameParam(String usernameParam) {
		super.setUsernameParam(usernameParam);
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	};
}
