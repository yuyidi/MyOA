package com.yyd.myoa.service;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.yyd.myoa.domain.Roleright;
import com.yyd.myoa.domain.Sysfun;
import com.yyd.myoa.service.SysFunRepositoryService;

public class SysFunServiceTest extends BaseServiceTest {
	
	@Autowired
	private SysFunRepositoryService sysFunrepositoryService;
	
	@Test
	public void sysfunList(){
		List<Sysfun> sysfunList = sysFunrepositoryService.sysFunList();
		createJSONResult(sysfunList);
	}
}
