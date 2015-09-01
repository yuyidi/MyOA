package com.yyd.myoa.service;


import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.yuyidi.myoa.justest.User;
import com.yuyidi.myoa.justest.UserService;
import com.yyd.myoa.model.UserInfo;
import com.yyd.myoa.query.UserInfoQuery;
import com.yyd.myoa.redis.UserInfoRedis;


public class UserinfoServiceTest extends BaseServiceTest{
    @Autowired
	private UserInfoService userInfoService;
    
    @Autowired
    private UserInfoRedis userInfoRedis;
    
    RestTemplate restTemplate = new RestTemplate();
	
	@Test
	public void getPassword(){
		String name = "admin";
		String password = "password";
		String loginPassword=DigestUtils.md5Hex(name+password).toLowerCase();
		System.out.println(loginPassword);
	}
	
	@Test
	public void getUser(){
		UserInfoQuery query = new UserInfoQuery();
	    Page<UserInfo> userinfo = userInfoService.getUserinfoList(query);
	    createJSONResult(userinfo);
	}
	@Test
	public void restTemplate(){
		String url = "http://127.0.0.1:8081/myoa/user-info/demo.json";
		RestTemplate rest = new RestTemplate();
	    MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("status", "true");
	    HttpHeaders headers = new HttpHeaders();
        // 为了避免RestTemplate默认的ISO-8859-1编码，这里用UTF-8编码设一下
        headers.setContentType(new MediaType("text", "plain", Charset.forName("UTF-8")));
	    param.add("name",JSON.toJSONString(map));
//	    param.add("name","demo"); //如果是json数据的话  就需要添加一个httpentity header
//	    String string = rest.postForObject(url, param, String.class);
	    HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String,Object>>(param,headers);
	    ResponseEntity<String> responseEntity = rest.exchange(url, HttpMethod.POST, httpEntity, String.class);	    
	    System.out.println(responseEntity.getBody());
	}
	
	@Test
	public void testRedis(){
		List<String> keys = new ArrayList<String>();
		keys.add("1");
		keys.add("2");
		keys.add("3");
		List<UserInfo> userInfos= userInfoRedis.listConn(keys);
//		List<UserInfo> userInfos =userInfoRedis.listPipe(keys);
		createJSONResult(userInfos);
	}
	
	public void save(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("test3");
		userInfo.setUserName("余乙迪");
		userInfo.setEmail("243549367@qq.com");
		userInfoRedis.save(userInfo);
	}
	
	@Test
	public void get(){
		UserInfo user=userInfoRedis.get("3");
		System.out.println(user.getUserId());
		createJSONResult(user);
	}
}
