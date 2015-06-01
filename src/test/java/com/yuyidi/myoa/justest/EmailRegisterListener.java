package com.yuyidi.myoa.justest;

public class EmailRegisterListener implements RegisterListener {
	
	public void subscribe(){
		ListenerManager.getInstance().addListener(this);
	}
	private EmailService emailService=new EmailService();
	@Override
	public void execute() {
		emailService.sendEmail();
	}
	@Override
	public void run() {
		execute();
	}

}
