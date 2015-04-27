package com.yyd.myoa.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.yyd.myoa.query.PageQuery;

public class BaseService {
	
	public PageBounds createPageBounds(PageQuery query){
		if(query == null){
			query = new PageQuery();
		}
		PageBounds pageBounds;
		if(query.getOrder() != null){
			pageBounds = new PageBounds(query.getPage(), query.getLimit(), query.getOrder());
		}else{
			pageBounds = new PageBounds(query.getPage(), query.getLimit());
		}
		return pageBounds;
	}
}
