package com.yyd.myoa.utils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class Mail {
	private Logger log = LoggerFactory.getLogger(Mail.class);
	private MailSender mailSender;
	private SimpleMailMessage simpleMailMessage;
	private MimeMessage mimeMessage=((JavaMailSenderImpl) mailSender).createMimeMessage();
	private MimeMessageHelper helper=null;
	
	public void sendMail(String subject,String content,String to) throws MessagingException{
		helper = new MimeMessageHelper(mimeMessage, true, "utf-8");
		helper.setFrom(simpleMailMessage.getFrom());
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(content,true);
		((JavaMailSender)mailSender).send(mimeMessage);
	}
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}
}
