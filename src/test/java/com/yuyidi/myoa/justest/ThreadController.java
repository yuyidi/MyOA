package com.yuyidi.myoa.justest;

public class ThreadController implements Runnable {

	private Thread t1;
	
	@Override
	public void run() {
		System.out.println("开始执行"+Thread.currentThread().getName());
		t1 = new Thread(this);
		t1.start();
		System.out.println("我没执行"+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadController());
		t.start();
	}
}
