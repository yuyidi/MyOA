package com.yyd.myoa.interceptor;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yyd.myoa.constant.SystemConstant;

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
    protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
            ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        subject.getSession().setAttribute(SystemConstant.SHIRO_USER,subject.getPrincipal());
        String url = this.getSuccessUrl();
        System.out.println(url);
        log.info("成功登录后的请求地址："+url);
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + url);
        return false;
    }
}
