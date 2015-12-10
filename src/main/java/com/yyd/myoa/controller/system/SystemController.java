package com.yyd.myoa.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.constant.SystemConstant;
import com.yyd.myoa.controller.BaseController;
import com.yyd.myoa.model.MeetingInfo;
import com.yyd.myoa.service.SysFunService;


@Controller
public class SystemController extends BaseController {
	@Autowired
	private SysFunService sysFunSerice;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login(@RequestParam("userId") String userId, @RequestParam("password") String password,
            ModelMap model,HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken();
        token.setUsername(userId);
        token.setPassword(password.toCharArray());
        token.setRememberMe(true);
        subject.login(token);
        request.getSession().setAttribute("sysfun", sysFunSerice.select());
        model.addAttribute("success", "/index");
    }

    /**
     * 
    * @Title: mettingInfos
    * @Description:会议信息
    * @return List<MeetingInfo>
    * @throws
     */
    @RequestMapping("/meeting")
    public void mettingInfos(ModelMap model){
    	List<MeetingInfo> mettinginfos = sysFunSerice.meetinginfos();
    	creatJSONResult(model, mettinginfos);
    }

    @RequestMapping(value = "/400")
    public ModelAndView badRequest() {
        return new ModelAndView("400");
    }

    @RequestMapping(value = "/500")
    public ModelAndView serverError() {
        return new ModelAndView("500");
    }


    @RequestMapping(value = "/404")
    public ModelAndView resourceNotFound() {
        return new ModelAndView("404");
    }


    @RequestMapping(value = "/index")
    public ModelAndView index(ModelMap model) {
        return new ModelAndView("index");
    }
}
