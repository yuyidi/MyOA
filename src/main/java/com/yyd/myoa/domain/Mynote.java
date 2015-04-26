package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the mynote database table.
 * 
 */
public class Mynote implements Serializable {
	private static final long serialVersionUID = 1L;

	private int noteId;

	private Date createTime;

	private String noteContent;

	private String noteTitle;

	private Userinfo userinfo;

    public Mynote() {
    }

	public int getNoteId() {
		return this.noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNoteContent() {
		return this.noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public String getNoteTitle() {
		return this.noteTitle;
	}

	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}
	
}