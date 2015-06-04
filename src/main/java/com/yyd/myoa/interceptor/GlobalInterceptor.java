package com.yyd.myoa.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.shiro.ShiroTagFreeMarkerConfigurer;

public class GlobalInterceptor implements HandlerInterceptor {
    
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {

    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
            throws Exception {
        return true;
    }
}
