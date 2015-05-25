package com.yyd.myoa.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.shiro.ShiroTagFreeMarkerConfigurer;


@Component
public class GlobalInterceptor implements HandlerInterceptor {
    private String title;
    
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub

    }


    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("title", "我的办公自动化");
    }


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object)
            throws Exception {
        return true;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
