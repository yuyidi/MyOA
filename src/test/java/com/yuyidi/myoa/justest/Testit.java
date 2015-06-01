package com.yuyidi.myoa.justest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class Testit {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		User u1 = new User(1, 1, "f1");
		User u2 = new User(2, 1, "f2");
		User u3 = new User(3, 2, "f3");
		User u7 = new User(7, 3, "f7");
		User u4 = new User(4, 4, "f4");
		User u5 = new User(5, 4, "f5");
		User u6 = new User(6, 5, "f6");
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		list.add(u6);
		list.add(u7);
		Map<Integer, Map<Integer, List<User>>> map = new HashMap<Integer, Map<Integer, List<User>>>();
		map = Testit.it(map, list);
		System.out.println(JSON.toJSON(map));
	}

	public static Map<Integer, Map<Integer, List<User>>> it(Map<Integer, Map<Integer, List<User>>> map,
			List <User> list) {
		if (list != null) {
			for (User user : list) {
				if (user.getId() == user.getPid()) {
					Map<Integer, List<User>> maplist = new HashMap<Integer, List<User>>();
					map.put(user.getPid(), maplist);
				} else {
					if (map.get(user.getPid()) != null) {
						List<User> listobj = new ArrayList<User>();
						map.get(user.getPid()).put(user.getId(), listobj);
					} else {
						it(map, map.get(user.getPid()).get(user.getPid()));
					}
				}
			}
		}
		return map;
	}
}
