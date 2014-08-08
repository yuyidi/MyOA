package com.yyd.myoa.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

import com.yyd.myoa.exception.ValidateException;

import freemarker.template.utility.StringUtil;

public class MyUtils {
	
	/**
	 * 获取明文密码
	 * @param username
	 * @param password
	 * @return
	 * @throws ValidateException 
	 * @throws UserinfoException
	 */
	public static String getHexPassword(String username,String password){
		return DigestUtils.md5Hex(username+password).toLowerCase();
	}
}
