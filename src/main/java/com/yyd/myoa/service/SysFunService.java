package com.yyd.myoa.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyd.myoa.dao.SysFunMapper;
import com.yyd.myoa.dto.Menu;
import com.yyd.myoa.model.SysFun;

@Service
public class SysFunService {
	@Autowired
	private SysFunMapper sysFunMapper;
	
	/**
	 * 
	* @Title: select
	* @Description: 树菜单
	* @return List<Menu>
	* @throws
	 */
	public List<Menu> select(){
		List<SysFun> lists = sysFunMapper.find();
		Map<Integer, Menu> map = new HashMap<Integer, Menu>();
		List<Menu> listshow = new ArrayList<Menu>();
		for (SysFun sysFun : lists) {
			if(sysFun.getNodeId().equals(sysFun.getParentNodeId())){
				Menu menu = new Menu(sysFun.getNodeId(),sysFun.getDisplayName(),sysFun.getIcon());
				map.put(sysFun.getNodeId(), menu);
				listshow.add(menu);
			}else{
				if(map.get(sysFun.getParentNodeId()) != null){
					map.get(sysFun.getParentNodeId()).getChilds().add(sysFun);
				}
			}
		}
		return  listshow;
	}
}
