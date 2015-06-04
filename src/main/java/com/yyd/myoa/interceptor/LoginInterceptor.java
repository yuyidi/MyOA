package com.yyd.myoa.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.model.LoginLog;
import com.yyd.myoa.service.UserInfoService;
import com.yyd.myoa.shiro.ShiroTagFreeMarkerConfigurer;
import com.yyd.myoa.utils.HttpUtils;

public class LoginInterceptor implements HandlerInterceptor {
    private UserInfoService userInfoService;
    
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    	userInfoService.loginLog(new LoginLog(request.getParameter("userId"),new Date(),1,HttpUtils.getIp(request),"登录"));
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
            throws Exception {
        return true;
    }
    
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
}
