package com.yuyidi.myoa.justest;

public class ListenerMain {
	public static void main(String[] args) {
		UserService us = new UserService();
		long start = System.currentTimeMillis();
		us.register();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
