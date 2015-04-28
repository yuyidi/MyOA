package com.yyd.myoa.controller;

import java.util.HashMap;
import java.util.Map;

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
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(@RequestParam("userId")String userId,@RequestParam("password") String password,ModelMap model){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userId);
        token.setPassword(password.toCharArray());
        subject.login(token);
        Map<String, String> map = new HashMap<String, String>();
        return "redirect:/";
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
    
    @RequestMapping(value="/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
