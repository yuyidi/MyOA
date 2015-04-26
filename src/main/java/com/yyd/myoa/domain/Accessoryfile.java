package com.yyd.myoa.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the accessoryfile database table.
 * 
 */
public class Accessoryfile implements Serializable {
	private static final long serialVersionUID = 1L;

	private int accessoryId;

	private String accessoryName;

	private String accessoryPath;

	private int accessorySize;

	private int accessoryType;

	private Date createDate;

	private Fileinfo fileinfo;

    public Accessoryfile() {
    }

	public int getAccessoryId() {
		return this.accessoryId;
	}

	public void setAccessoryId(int accessoryId) {
		this.accessoryId = accessoryId;
	}

	public String getAccessoryName() {
		return this.accessoryName;
	}

	public void setAccessoryName(String accessoryName) {
		this.accessoryName = accessoryName;
	}

	public String getAccessoryPath() {
		return this.accessoryPath;
	}

	public void setAccessoryPath(String accessoryPath) {
		this.accessoryPath = accessoryPath;
	}

	public int getAccessorySize() {
		return this.accessorySize;
	}

	public void setAccessorySize(int accessorySize) {
		this.accessorySize = accessorySize;
	}

	public int getAccessoryType() {
		return this.accessoryType;
	}

	public void setAccessoryType(int accessoryType) {
		this.accessoryType = accessoryType;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Fileinfo getFileinfo() {
		return this.fileinfo;
	}

	public void setFileinfo(Fileinfo fileinfo) {
		this.fileinfo = fileinfo;
	}
	
}