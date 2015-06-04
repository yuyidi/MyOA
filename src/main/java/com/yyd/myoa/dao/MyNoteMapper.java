package com.yyd.myoa.dao;

import com.yyd.myoa.model.MyNote;

public interface MyNoteMapper {
    int deleteByPrimaryKey(Integer noteId);

    int insert(MyNote record);

    int insertSelective(MyNote record);

    MyNote selectByPrimaryKey(Integer noteId);

    int updateByPrimaryKeySelective(MyNote record);

    int updateByPrimaryKey(MyNote record);
}