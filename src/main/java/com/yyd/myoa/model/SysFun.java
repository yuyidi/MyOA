package com.yyd.myoa.model;

import java.util.ArrayList;
import java.util.List;

public class SysFun {
    private Integer nodeId;

    private String displayName;

    private String nodeUrl;

    private Integer displayOrder;

    private Integer parentNodeId;
    
    private String icon;
    
    private List<SysFun> childs = new ArrayList<SysFun>();
    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    public String getNodeUrl() {
        return nodeUrl;
    }

    public void setNodeUrl(String nodeUrl) {
        this.nodeUrl = nodeUrl == null ? null : nodeUrl.trim();
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Integer getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<SysFun> getChilds() {
		return childs;
	}

	public void setChilds(List<SysFun> childs) {
		this.childs = childs;
	}
}