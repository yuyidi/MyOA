package com.yyd.myoa.service;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:springDatasource.xml","classpath:springMVC.xml","classpath:springMybatis.xml"})
public class BaseServiceTest {
	
	public void createJSONResult(Object object) {
		System.out.println(JSON.toJSONString(object));
	}
}
