package com.yuyidi.myoa.justest;

import java.util.concurrent.Callable;

public class Futrue implements Callable<String> {
	private String data;
	
	public Futrue(String data) {
		super();
		this.data = data;
	}


	@Override
	public String call() throws Exception {
		Thread.sleep(3000);
		return data;
	}

}
