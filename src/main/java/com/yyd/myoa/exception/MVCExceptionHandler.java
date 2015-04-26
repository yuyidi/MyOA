package com.yyd.myoa.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.constant.SystemConstant;
import com.yyd.myoa.exception.ValidateException;


/**
 * 自定义异常处理类
 * @author Administrator
 *
 */
public class MVCExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) {
        Map<String, Object> model = new HashMap<String, Object>();
        ModelAndView mv = new ModelAndView();
        // 此处可以根据不用的异常返回不同的视图
        String message = "未知错误";
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        try {
          //验证错误异常(参数异常)
            if(ex instanceof ValidateException){
                message = ex.getMessage();
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                mv.setViewName("400");
            }
            //业务层异常处理
            if(ex instanceof ServiceException){
                ServiceException se = (ServiceException) ex;
                message = se.getMessage();
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                mv.setViewName("400");
            }
            //权限，未知账户异常
            if(ex instanceof UnknownAccountException){
                message = SystemConstant.UNKNOWN_ACCOUNT_EXCEPTION;
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }
            //权限，密码错误异常
            if(ex instanceof IncorrectCredentialsException){
                message = SystemConstant.INCORRECT_CREDENTIALS_EXCEPTION;
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }
            //权限，账户已锁定异常
            if(ex instanceof LockedAccountException){
                message = SystemConstant.LOCKED_ACCOUNT_EXCEPTION;
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            }
            //授权异常，一般都是登录成功后就会被授权，所以此授权异常不起作用
//            if(ex instanceof AuthenticationException){
//                message = SystemConstant.AUTHENTICATION_EXCEPTION;
//                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//            }
        }
        finally {
            model.put("msg", message);
            mv.addObject("result", model);
        }
        return  mv;
    }

}
