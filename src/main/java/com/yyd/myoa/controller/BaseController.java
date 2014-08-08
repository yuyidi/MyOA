package com.yyd.myoa.controller;

import org.springframework.ui.ModelMap;

public abstract class BaseController {
    
    protected void creatJSONResult(ModelMap model, Object obj) {
        model.addAttribute("result", obj);
    }
    
}
