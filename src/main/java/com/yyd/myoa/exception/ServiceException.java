package com.yyd.myoa.exception;

public class ServiceException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public static final String USER_REGISTER_ERROR="002";
    
    private String type;

    public ServiceException(String type,Exception exp) {
        super(exp);
        this.type = type;
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
    public static ServiceException userRegisterError(Exception ex){
        return new ServiceException(USER_REGISTER_ERROR,ex);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
