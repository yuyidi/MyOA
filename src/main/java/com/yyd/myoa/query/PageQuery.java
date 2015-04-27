package com.yyd.myoa.query;

import com.github.miemiedev.mybatis.paginator.domain.Order;

public class PageQuery {
	private int page;
	private int limit = 10;
	private Order order;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}
