package com.yuyidi.myoa.justest;

import java.io.Serializable;

public class User implements Serializable{
	 private Integer id;
	 private Integer pid;
	 private String name;

	 public User() {
		 super();
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public User(int id, int pid, String name) {
		this.id = id;
		this.pid = pid;
		this.name = name;
	}
}