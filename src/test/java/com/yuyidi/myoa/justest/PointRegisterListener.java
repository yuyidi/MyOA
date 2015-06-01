package com.yuyidi.myoa.justest;

public class PointRegisterListener implements RegisterListener {
	public void subscribe(){
		ListenerManager.getInstance().addListener(this);
	}
	private PointService ps = new PointService();
	@Override
	public void execute() {
		ps.addPoint();
	}
	@Override
	public void run() {
		execute();
	}

}
