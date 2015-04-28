package com.yyd.myoa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController {

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
