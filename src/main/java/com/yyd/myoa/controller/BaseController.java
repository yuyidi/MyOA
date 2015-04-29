package com.yyd.myoa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

public abstract class BaseController {
    Logger log = LoggerFactory.getLogger(getClass().getName());
    protected void creatJSONResult(ModelMap model, Object obj) {
        model.addAttribute("result", obj);
    }
    
}
