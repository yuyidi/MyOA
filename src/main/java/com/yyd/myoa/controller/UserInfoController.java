package com.yyd.myoa.controller;

import java.sql.SQLException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yyd.myoa.exception.ServiceException;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.service.Page;
import com.yyd.myoa.service.UserInfoService;



@Controller
@RequestMapping("/user-info")
public class UserInfoController {
    
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/login")
	public void login(@RequestParam("userId")String userId,@RequestParam("password") String password,ModelMap model) throws Exception{
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken();
		token.setUsername(userId);
		token.setPassword(password.toCharArray());
		subject.login(token);
	}
	
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
	 * 
	* @Title: register
	* @Description: 用户注册
	* @return void
	* @throws
	 */
	@RequestMapping(value="/register")
	public void register(UserInfo userInfo,ModelMap modelMap) throws ServiceException{
		UserInfo user = new UserInfo("yyd", "余乙迪", "yuyidi0630", 1);
		Integer result = userInfoService.registerUser(user);
		if(result>0){
			modelMap.put("result", "添加成功");
		}
	}
}
