package com.yyd.myoa.exception;

/**
 * 
* @ClassName: com.yyd.myoa.exception 
* @Description: 业务异常 
* @author yuyidi0630@163.com 
* @date 2015年11月25日 下午6:54:44
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    //-----------------------------用户异常开始---------------------
    /**注册异常*/
    public static final String USER_REGISTER_ERROR="1001";
    /**登录异常*/
    public static final String USER_LOGIN_ERROR="1002";
    
    //-----------------------------用户异常结束---------------------
    
    private String type;
    

    public ServiceException(String type) {
        this.type = type;
    }
    
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
