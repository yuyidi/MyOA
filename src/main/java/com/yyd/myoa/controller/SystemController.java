package com.yyd.myoa.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController extends BaseController {
    
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String login(){
        return "login";
    }
    
    @RequestMapping(value="/loging",method=RequestMethod.POST)
    public String login(@RequestParam("username")String username,@RequestParam("password") String password,@RequestParam(value="rememberMe",required=false,defaultValue="0") Integer rememberMe,ModelMap model){
    	System.out.println("111");
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken token = new UsernamePasswordToken();
//        token.setUsername(username);
//        token.setPassword(password.toCharArray());
//        token.setRememberMe(false);
//        if(rememberMe ==1){
//        	token.setRememberMe(true);
//        }
//        subject.login(token);
//        return "redirect:/index";
    	return null;
    }

    @RequestMapping(value="/400")
    public ModelAndView badRequest(){
        return new ModelAndView("400");
    }
    
    @RequestMapping(value="/500")
    public ModelAndView serverError(){
        return new ModelAndView("500");
    }
    
    @RequestMapping(value="/404")
    public ModelAndView resourceNotFound(){
        return new ModelAndView("404");
    }
    
    @RequestMapping(value="/index")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
