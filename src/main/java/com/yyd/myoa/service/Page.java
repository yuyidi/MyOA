package com.yyd.myoa.service;

import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.github.miemiedev.mybatis.paginator.domain.Paginator;

public class Page<T> {
	private PageList<T> pageList;
	private Paginator paginator;
	
	public Page(PageList<T> pageList) {
		this.pageList = pageList;
		this.paginator = pageList.getPaginator();
	}

	public PageList<T> getPageList() {
		return pageList;
	}

	public void setPageList(PageList<T> pageList) {
		this.pageList = pageList;
	}

	public Paginator getPaginator() {
		return paginator;
	}

	public void setPaginator(Paginator paginator) {
		this.paginator = paginator;
	}
}
