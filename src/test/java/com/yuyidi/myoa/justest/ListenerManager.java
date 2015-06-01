package com.yuyidi.myoa.justest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListenerManager {
//	private Map<String, RegisterListener> map= new HashMap<String, RegisterListener>();
	private List<RegisterListener> list= new ArrayList<RegisterListener>();
	
	/**添加监听器**/
	public void addListener(RegisterListener registerListener){
		list.add(registerListener);
	}
	
	public List<RegisterListener> getListener(){
		return list;
	}
	
	public static ListenerManager getInstance(){
		return ListennerInstance.listenerManager;
	}
	
	private static class ListennerInstance{
		private static ListenerManager listenerManager = new ListenerManager();
	}
}
