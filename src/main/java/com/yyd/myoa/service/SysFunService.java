package com.yyd.myoa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyd.myoa.dao.MeetingInfoMapper;
import com.yyd.myoa.dao.SysFunMapper;
import com.yyd.myoa.dto.Menu;
import com.yyd.myoa.model.MeetingInfo;
import com.yyd.myoa.model.SysFun;

@Service
public class SysFunService {
	@Autowired
	private SysFunMapper sysFunMapper;
	@Autowired
	private MeetingInfoMapper meetingInfoMapper;
	
	/**
	 * 
	* @Title: select
	* @Description: 树菜单
	* @return List<Menu>
	* @throws
	 */
	public List<SysFun> select(){
		List<SysFun> lists = sysFunMapper.find();
		return  menu(lists, 0);
	}
	
	public List<SysFun> menu(List<SysFun> menus,Integer pid){
		List<SysFun> result = new ArrayList<SysFun>();
		for (SysFun sysFun : menus) {
			if(sysFun.getParentNodeId().equals(pid)){
				List<SysFun> childs = menu(menus,sysFun.getNodeId());
				sysFun.setChilds(childs);
				result.add(sysFun);
			}
		}
		return result;
	}
	
	public List<MeetingInfo> meetinginfos(){
		List<MeetingInfo> mettinginfos = meetingInfoMapper.select();
		return mettinginfos;
	}
}
