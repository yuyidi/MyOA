package com.yyd.myoa.plugin;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.yyd.myoa.service.UserInfoService;

public class SessionListener implements HttpSessionListener {
	Logger log = LoggerFactory.getLogger(SessionListener.class);
    private UserInfoService userInfoService;
    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
      //10分钟后session被销毁，重新登录
        session.setMaxInactiveInterval(10*60);
        log.info("session:"+session.getId());
    }


    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        userInfoService = getBean(se, "userInfoService");
        log.info("session 已被销毁看是否需要重新登陆");
//        System.out.println("session 被销毁："+session.getMaxInactiveInterval()+"秒"+userInfoService.getUserinfo("admin", "password").getUserName());
    }
    
    
    @SuppressWarnings("unchecked")
    public static <T> T getBean(HttpSessionEvent se,String name){
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(se.getSession().getServletContext());
        return (T) applicationContext.getBean(name);
    }
}
