package com.yyd.myoa.interceptor;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.yyd.myoa.constant.SystemConstant;

public class AuthcFormAuthenticationFilter extends FormAuthenticationFilter {
    
    
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
            ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        subject.getSession().setAttribute(SystemConstant.SHIRO_USER,subject.getPrincipal());
        String url = this.getSuccessUrl();
        System.out.println("url"+url);
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + url);
        return false;
    }
}
