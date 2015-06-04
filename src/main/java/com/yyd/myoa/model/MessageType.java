package com.yyd.myoa.model;

public class MessageType {
    private Integer messageTypeId;

    private String messageTypeName;

    private String messageDesc;

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public String getMessageTypeName() {
        return messageTypeName;
    }

    public void setMessageTypeName(String messageTypeName) {
        this.messageTypeName = messageTypeName == null ? null : messageTypeName.trim();
    }

    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc == null ? null : messageDesc.trim();
    }
}