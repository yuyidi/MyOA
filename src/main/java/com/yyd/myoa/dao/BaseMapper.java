package com.yyd.myoa.dao;

import java.io.Serializable;
import java.util.List;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface BaseMapper<T, PK extends Serializable, E> {
	
	List<T> selectByQuery(E query, PageBounds rowBounds);

    int countByExample(E example);

    int deleteByExample(E example);


    int deleteByPrimaryKey(PK id);


    int insert(T record);


    int insertSelective(T record);


    List<T> selectByExample(E example);


    T selectByPrimaryKey(PK id);


    int updateByExampleSelective(T record, E example);


    int updateByExample(T record,E example);


    int updateByPrimaryKeySelective(T record);


    int updateByPrimaryKey(T record);
}
