package com.yyd.myoa.service;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.yyd.myoa.query.PageQuery;

public class BaseService{
	Logger log = LoggerFactory.getLogger(getClass().getName());
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
