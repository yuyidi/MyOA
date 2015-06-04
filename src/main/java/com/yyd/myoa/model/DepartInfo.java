package com.yyd.myoa.model;

public class DepartInfo {
    private Integer departId;

    private String departName;

    private String principalUser;

    private Long connectTelNo;

    private Long connectMobileTelNo;

    private Long fares;

    private Integer branchId;

    private Integer ifDeleteDepart;

    public Integer getDepartId() {
        return departId;
    }

    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getPrincipalUser() {
        return principalUser;
    }

    public void setPrincipalUser(String principalUser) {
        this.principalUser = principalUser == null ? null : principalUser.trim();
    }

    public Long getConnectTelNo() {
        return connectTelNo;
    }

    public void setConnectTelNo(Long connectTelNo) {
        this.connectTelNo = connectTelNo;
    }

    public Long getConnectMobileTelNo() {
        return connectMobileTelNo;
    }

    public void setConnectMobileTelNo(Long connectMobileTelNo) {
        this.connectMobileTelNo = connectMobileTelNo;
    }

    public Long getFares() {
        return fares;
    }

    public void setFares(Long fares) {
        this.fares = fares;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    public Integer getIfDeleteDepart() {
        return ifDeleteDepart;
    }

    public void setIfDeleteDepart(Integer ifDeleteDepart) {
        this.ifDeleteDepart = ifDeleteDepart;
    }
}