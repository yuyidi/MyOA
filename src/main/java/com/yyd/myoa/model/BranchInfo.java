package com.yyd.myoa.model;

public class BranchInfo {
    private Integer branchId;

    private String branchName;

    private String branchShortName;

    private Integer ifDeleteBrance;

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName == null ? null : branchName.trim();
    }

    public String getBranchShortName() {
        return branchShortName;
    }

    public void setBranchShortName(String branchShortName) {
        this.branchShortName = branchShortName == null ? null : branchShortName.trim();
    }

    public Integer getIfDeleteBrance() {
        return ifDeleteBrance;
    }

    public void setIfDeleteBrance(Integer ifDeleteBrance) {
        this.ifDeleteBrance = ifDeleteBrance;
    }
}