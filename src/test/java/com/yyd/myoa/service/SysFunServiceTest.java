package com.yyd.myoa.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyd.myoa.model.SysFun;

public class SysFunServiceTest extends BaseServiceTest {
	
	@Autowired
	private SysFunService sysFunService;
	
	@Test
	public void select(){
		List<SysFun> shows = sysFunService.select();
		createJSONResult(shows);
	}
}
