package com.yyd.myoa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/user")
public class UserinfoController {
    
	
	@RequestMapping(value="/login")
	public void login(@RequestParam("userId")String userId,@RequestParam("password") String password,ModelMap model) throws Exception{
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken();
		token.setUsername(userId);
		token.setPassword(password.toCharArray());
		subject.login(token);
		model.addAttribute("status", true);
	}
	
	@RequestMapping(value="/table")
	public String user(ModelMap model){
	    model.addAttribute("yuyidi", "余乙迪");
	    return "table";
	}
}
