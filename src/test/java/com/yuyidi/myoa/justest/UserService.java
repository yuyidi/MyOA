package com.yuyidi.myoa.justest;

import java.util.List;
public class UserService{
	/**
	 * 
	* @Title: register
	* @Description: 用户注册
	* @return void
	* @throws
	 */
	public void register(){
		EmailRegisterListener emailRegisterListener = new EmailRegisterListener();
		PointRegisterListener pointRegisterListener = new PointRegisterListener();
		emailRegisterListener.subscribe();
		pointRegisterListener.subscribe();
		List<RegisterListener> list = ListenerManager.getInstance().getListener();
		for (int i = 0; i < list.size(); i++) {
			Thread thread = new Thread(list.get(i));
			thread.start();
//			try {
//				thread.join();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}
