package com.yyd.myoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyd.myoa.domain.Sysfun;
import com.yyd.myoa.service.SysFunRepositoryService;

@Controller
public class SysFunController extends BaseController {

    @Autowired
    private SysFunRepositoryService sysFunRepositoryService;
    
    @RequestMapping("/sysfuns")
    public void sysFunList(ModelMap model){
        List<Sysfun> sysFuns = sysFunRepositoryService.sysFunList();
        creatJSONResult(model, sysFuns);
    }
}
