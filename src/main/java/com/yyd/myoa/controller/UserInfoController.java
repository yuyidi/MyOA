package com.yyd.myoa.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.service.Page;
import com.yyd.myoa.service.UserInfoService;



@Controller
@RequestMapping("/user-info")
public class UserInfoController extends BaseController {
    
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/table")
	public void user(ModelMap model,@RequestParam(value="page",required=false) int page){
		UserInfoQuery query = new UserInfoQuery();
		query.setLimit(5);
		query.setPage(page);
	    Page<UserInfo> userInfos=  userInfoService.getUserinfoList(query);
	    model.put("result", userInfos);
	}
	@RequestMapping(value="/demo")
	public String demo(){
	    return "demo";
	}
	
	/**
	 * @throws ServiceException 
	* @Title: register
	* @Description: 用户注册
	* @return void
	* @throws
	 */
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(UserInfo userInfo,ModelMap model,HttpServletRequest request) throws ServiceException{
		String result = userInfoService.registerUser(userInfo,request.getContextPath());
		Map<String, String> map = new HashMap<String, String>();
		log.debug(result);
		map.put("message", result);
//		creatJSONResult(model, map);
		return "redirect:/login";
	}
	
	/**
	 * @throws ServiceException 
	 * 
	* @Title: verify
	* @Description:验证邮箱注册
	* @return void
	* @throws
	 */
	@RequestMapping(value="/verify")
	public String verify(@RequestParam("userActiCode") String userActiCode,@RequestParam("random") String random) throws ServiceException{
		userInfoService.verify(random, userActiCode);
		return "redirect:/login";
	}
}
