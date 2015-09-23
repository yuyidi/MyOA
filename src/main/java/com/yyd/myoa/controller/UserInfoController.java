package com.yyd.myoa.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
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
	    creatJSONResult(model, userInfos);
	}
	
	@RequestMapping(value="/demo",method=RequestMethod.POST)
	public String demo(@RequestParam(value="name",required=false)String demo){
		System.out.println(demo);
	    return "demo";
	}
	
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String demo(ModelMap model) throws ServiceException{
		model.addAttribute("status","ok");
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
		map.put("message", result);
		log.debug(result);
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
	
	@RequestMapping("/session")
	public void session(HttpServletRequest request,HttpServletResponse response) throws IOException{
		//获取session  如果是第一次请求，则等同于 request.getSession(true); 如果是已经存在，则获取session
		HttpSession session = request.getSession();
		if(session.isNew()){
			session.setAttribute("name", "余乙迪");
		}
		//获取session
		String sessionID = session.getId();
		PrintWriter out = response.getWriter();
		if(session.isNew()){
			out.println("Hello,HttpSession! <br>The first response - SeesionId="
                    + sessionID + " <br>");
		}else{
			out.println("Hello,HttpSession! <br>The second response - SeesionId="	
                    + sessionID + " <br>");
            // 从Session获取属性值
            out.println("The second-response - name: "
                    + session.getAttribute("name"));
		}
	}
}
