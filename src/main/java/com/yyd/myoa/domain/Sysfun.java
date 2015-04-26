package com.yyd.myoa.domain;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Set;


/**
 * The persistent class for the sysfun database table.
 * 
 */
public class Sysfun implements Serializable {
	private static final long serialVersionUID = 1L;

	private int nodeId;

	private String displayName;

	private int displayOrder;

	private String myId;

	private String nodeURL;

	private int parentNodeId;

	private Set<Roleright> rolerights;

    public Sysfun() {
    }

	public int getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getMyId() {
		return this.myId;
	}

	public void setMyId(String myId) {
		this.myId = myId;
	}

	public String getNodeURL() {
		return this.nodeURL;
	}

	public void setNodeURL(String nodeURL) {
		this.nodeURL = nodeURL;
	}

	public int getParentNodeId() {
		return this.parentNodeId;
	}

	public void setParentNodeId(int parentNodeId) {
		this.parentNodeId = parentNodeId;
	}

	@JSONField(serialize=false)
	public Set<Roleright> getRolerights() {
		return this.rolerights;
	}

	public void setRolerights(Set<Roleright> rolerights) {
		this.rolerights = rolerights;
	}
	
}