package com.yyd.myoa.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.yyd.myoa.constant.SystemConstant;


/**
 * 自定义异常处理类
 * @author Administrator
 *
 */
public class MVCExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
            Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        String message = "未知错误";
        String code = "0000";
        response.setStatus(HttpServletResponse.SC_OK);
        try {
            if(ex instanceof ValidateException){
            	//验证错误异常(参数异常)
            	ValidateException ve = (ValidateException) ex;
                message = ve.showMsg();
            }else if(ex instanceof ServiceException){
                //业务层异常处理
                ServiceException se = (ServiceException) ex;
                message = se.showMsg();
                code =se.getType();
            }else if(ex instanceof UnknownAccountException){
            	//未知账户异常
                message = ex.getMessage();
            }else if(ex instanceof IncorrectCredentialsException){
            	 //密码错误异常
                message = SystemConstant.UNKNOWN_ACCOUNT_EXCEPTION;
            }else if(ex instanceof LockedAccountException){
            	//账户已锁定异常
                message = SystemConstant.LOCKED_ACCOUNT_EXCEPTION;
            }else if(ex instanceof ExcessiveAttemptsException){
            	//登陆异常次数超过规定次数
            	ExcessiveAttemptsException exAE = (ExcessiveAttemptsException) ex;
            	message = exAE.getMessage();
            }else if(ex instanceof AuthenticationException){
            	//统一认证异常
                message = SystemConstant.AUTHENTICATION_EXCEPTION;
            }
        }finally {
            mv.addObject("result", message);
            mv.addObject("code", code);
        }
        return  mv;
    }

}
