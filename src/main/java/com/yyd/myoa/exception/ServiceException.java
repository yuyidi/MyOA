package com.yyd.myoa.exception;

import java.lang.Thread.UncaughtExceptionHandler;

public class ServiceException extends Exception implements UncaughtExceptionHandler  {

    private static final long serialVersionUID = 1L;
    
    public static final String USER_INFO_ERROR ="001";
    public static final String USER_REGISTER_ERROR="002";
    
    private String type;
    private Integer code;
    
    /** 系统默认的UncaughtException处理类 */
    private Thread.UncaughtExceptionHandler mDefaultHandler;
    
    public ServiceException() {
        this.mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    }

    public ServiceException(String type, Integer code,Exception exp) {
        super(exp);
        this.type = type;
        this.code = code;
    }
    
    //提示错误信息
    public String showMsg(){
        String msg = "错误";
        if(ServiceExceptionMap.exceptionMap.containsKey(type)){
            msg = ServiceExceptionMap.exceptionMap.get(type);
        }
        return msg;
    }
    
    //用户信息错误
    public static ServiceException userInfoError(Exception ex){
        return new ServiceException(USER_INFO_ERROR, 0,ex);
    }
    
   //用户信息错误
    public static ServiceException userRegisterError(Exception ex){
        return new ServiceException(USER_REGISTER_ERROR, 0,ex);
    }


    public void uncaughtException(Thread t, Throwable e) {
        
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    
}
