package com.yyd.myoa.interceptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @ClassName: AuthcFormAuthenticationFilter
 * @Description: 解决登录成功后自动跳转问题
 * @author yuyidi
 * @date 2015年4月28日 下午2:26:54*
 */
public class AuthcFormAuthenticationFilter extends FormAuthenticationFilter {
	Logger log = LoggerFactory.getLogger(AuthcFormAuthenticationFilter.class);

	@Override
	protected boolean onLoginSuccess(AuthenticationToken token,
			Subject subject, ServletRequest request, ServletResponse response)
			throws Exception {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		// subject.getSession().setAttribute(SystemConstant.SHIRO_USER,subject.getPrincipal());
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
		try {
			PrintWriter out = response.getWriter();
			if(e.getCause() instanceof UnknownAccountException){
				out.print(JSON.toJSON("未知账户异常"));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return super.onLoginFailure(token, e, request, response);
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		return super.onAccessDenied(request, response);
	}

	public void setUsernameParam(String usernameParam) {
		super.setUsernameParam(usernameParam);
	};
}
