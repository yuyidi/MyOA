package com.yyd.myoa.dto;

import java.util.ArrayList;
import java.util.List;

import com.yyd.myoa.model.SysFun;

/**
 * 
* @ClassName: Menu
* @Description: 菜单显示 
* @author yuyidi
* @date 2015年6月5日 下午7:39:33*
 */
public class Menu {
	private Integer nodeId;
	private String displayName;
	private String icon;
	private List<SysFun> childs = new ArrayList<SysFun>();
	public Menu(Integer nodeId, String displayName,String icon) {
		super();
		this.nodeId = nodeId;
		this.displayName = displayName;
		this.icon = icon;
	}
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
		this.displayName = displayName;
	}
	public List<SysFun> getChilds() {
		return childs;
	}
	public void setChilds(List<SysFun> childs) {
		this.childs = childs;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
}
