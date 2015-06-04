package com.yyd.myoa.model;

public class FileTypeInfo {
    private Integer fileTypeId;

    private String fileTypeName;

    private String fileTypeImage;

    private String fileTypeSuffix;

    public Integer getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Integer fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public String getFileTypeName() {
        return fileTypeName;
    }

    public void setFileTypeName(String fileTypeName) {
        this.fileTypeName = fileTypeName == null ? null : fileTypeName.trim();
    }

    public String getFileTypeImage() {
        return fileTypeImage;
    }

    public void setFileTypeImage(String fileTypeImage) {
        this.fileTypeImage = fileTypeImage == null ? null : fileTypeImage.trim();
    }

    public String getFileTypeSuffix() {
        return fileTypeSuffix;
    }

    public void setFileTypeSuffix(String fileTypeSuffix) {
        this.fileTypeSuffix = fileTypeSuffix == null ? null : fileTypeSuffix.trim();
    }
}