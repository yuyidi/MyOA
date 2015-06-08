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
import com.yyd.myoa.exception.ValidateException;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.service.Page;
import com.yyd.myoa.service.SysFunService;
import com.yyd.myoa.service.UserInfoService;
import com.yyd.myoa.service.tag.SysFunTag;
import com.yyd.myoa.utils.HttpUtils;



@Controller
@RequestMapping("/user-info")
public class UserInfoController extends BaseController {
    
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/table")
	public void user(ModelMap model,@RequestParam(value="page",required=false) Integer page) throws ValidateException{
		UserInfoQuery query = new UserInfoQuery();
		query.setLimit(5);
		if(page==null){
			 throw new ValidateException("页码参数有误");
		}
		query.setPage(page);
	    Page<UserInfo> userInfos=  userInfoService.getUserinfoList(query);
	    model.put("result", userInfos);
	}
	
	@RequestMapping(value="/demo",method=RequestMethod.POST)
	public String demo(@RequestParam("name")String demo){
		System.out.println(demo);
	    return "demo";
	}
	
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String demo(ModelMap model){
//		model.addAttribute("myoa_sysfun_tag", new SysFunTag());
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
		String result = userInfoService.registerUser(userInfo,HttpUtils.getBasePath(request));
		Map<String, String> map = new HashMap<String, String>();
		log.debug(result);
		map.put("message", result);
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
	public String verify(@RequestParam("random") String random,@RequestParam("userActiCode") String userActiCode) throws ServiceException{
		userInfoService.verify(random, userActiCode);
		return "redirect:/login";
	}
}
