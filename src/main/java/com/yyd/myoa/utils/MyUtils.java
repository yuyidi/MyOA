package com.yyd.myoa.utils;

import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

import com.yyd.myoa.exception.ValidateException;

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
	
	/**
	 * 
	* @Title: getIntRandom
	* @Description: 获取随机数
	* @return int
	* @throws
	 */
	public static int getIntRandom(){
		Random rnd=new Random();
		return rnd.nextInt(999999);
	}
}
