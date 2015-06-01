package com.yuyidi.myoa.justest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutrueTaskMain {
	static ExecutorService es = Executors.newSingleThreadExecutor();
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		final FutureTask<String> futureTask = new FutureTask<String>(
				new Futrue("余乙迪"));
		long start = System.currentTimeMillis();
		es.submit(futureTask);
		Thread.sleep(1000);
//		System.out.println(futureTask.get());
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		Runnable run = new Runnable() {
			public void run() {
				try {
					Thread.sleep(3000);
					System.out.println(futureTask.get());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(run);
		t.start();
	}
}
