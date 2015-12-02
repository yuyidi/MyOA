package com.yyd.myoa.exception;

/**
 * 
 * 系统配置Key获得的Value为空
 * 
 */
public class ValidateException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public ValidateException(String msg) {
		this.message = msg;
	}
	public ValidateException(String msg,Exception ex) {
		super(ex);
		this.message = msg;
	}
	
	public String showMsg(){
		return message;
	}
}
