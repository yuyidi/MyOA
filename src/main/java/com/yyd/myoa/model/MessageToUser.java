package com.yyd.myoa.model;

public class MessageToUser {
    private Integer id;

    private Integer messageId;

    private String toUserId;

    private Integer ifRead;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId == null ? null : toUserId.trim();
    }

    public Integer getIfRead() {
        return ifRead;
    }

    public void setIfRead(Integer ifRead) {
        this.ifRead = ifRead;
    }
}