package com.yyd.myoa.service;

import java.io.Serializable;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;

public class Page<T> implements Serializable{
	private PageList<T> items;
	private Paginator paginator;
	
	public Page(PageList<T> items) {
		this.items = items;
		this.paginator = items.getPaginator();
	}

	public PageList<T> getItems() {
		return items;
	}

	public void setItems(PageList<T> items) {
		this.items = items;
	}

	public Paginator getPaginator() {
		return paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}
}
