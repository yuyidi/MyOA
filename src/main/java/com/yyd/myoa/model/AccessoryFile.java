package com.yyd.myoa.model;

import java.util.Date;

public class AccessoryFile {
    private Integer accessoryId;

    private Integer fileId;

    private String accessoryName;

    private Integer accessorySize;

    private Integer accessoryType;

    private Date createDate;

    private String accessoryPath;

    public Integer getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(Integer accessoryId) {
        this.accessoryId = accessoryId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName == null ? null : accessoryName.trim();
    }

    public Integer getAccessorySize() {
        return accessorySize;
    }

    public void setAccessorySize(Integer accessorySize) {
        this.accessorySize = accessorySize;
    }

    public Integer getAccessoryType() {
        return accessoryType;
    }

    public void setAccessoryType(Integer accessoryType) {
        this.accessoryType = accessoryType;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAccessoryPath() {
        return accessoryPath;
    }

    public void setAccessoryPath(String accessoryPath) {
        this.accessoryPath = accessoryPath == null ? null : accessoryPath.trim();
    }
}