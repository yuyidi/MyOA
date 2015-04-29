package com.yyd.myoa.service;

import javax.mail.MessagingException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yyd.myoa.utils.Mail;

public class MailTest {
	
	@Test
	public void testSendMail() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springMail.xml");
        Mail mail = (Mail)context.getBean("simpleMail");
        String html ="<html><head><meta http-equiv="+"Content-Type"+" content="+"text/html; charset=utf-8"+"></head><body><h1>MyOA,我的办公OA</h1>你的新书快递申请已推送新书，请到<a href=''>空间"  
                + "</a>中查看<br></body></html>";
        try {
			mail.sendMail("Spring SMTP Mail Subject", html, "243549367@qq.com");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
    }
}
