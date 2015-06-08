package com.yyd.myoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyd.myoa.dto.Menu;
import com.yyd.myoa.service.SysFunService;

/**
 * 
* @ClassName: PermissionController
* @Description:权限管理 
* @author yuyidi
* @date 2015年6月5日 下午9:10:30*
 */
@Controller
@RequestMapping("/permission")
public class PermissionController extends BaseController{
	@Autowired
	private SysFunService sysFunService;
	@RequestMapping("/menu")
	private void menu(ModelMap model){
		List<Menu> menu = sysFunService.select();
		creatJSONResult(model, menu);
	}
}
