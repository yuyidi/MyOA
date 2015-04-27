package com.yyd.myoa.plugin;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yyd.myoa.service.UserInfoService;

public class SessionListener implements HttpSessionListener {
    
    private UserInfoService userinfoRepositoryService;

    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
      //10分钟后session被销毁，重新登录
        session.setMaxInactiveInterval(10*60);
        System.out.println("session 被创建了");
    }


    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        userinfoRepositoryService = getBean(se, "userinfoRepositoryService");
        System.out.println("session 被销毁："+session.getMaxInactiveInterval()+"秒"+userinfoRepositoryService.getUserinfo("admin", "password").getUserName());
    }
    
    
    @SuppressWarnings("unchecked")
    public static <T> T getBean(HttpSessionEvent se,String name){
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(se.getSession().getServletContext());
        return (T) applicationContext.getBean(name);
    }
}
