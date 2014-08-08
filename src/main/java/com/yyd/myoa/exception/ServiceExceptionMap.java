package com.yyd.myoa.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * 将异常信息已文字的形式显示
 * @author Administrator
 *
 */
public class ServiceExceptionMap {
    public static  Map<String, String> exceptionMap = new HashMap<String, String>();
    
    static{
        exceptionMap.put(ServiceException.USER_INFO_ERROR, "用户ID或密码错误");
    }
}
