package com.springboot.service;

import org.springframework.beans.factory.annotation.Value;

public class EmailService {

	@Value("${notification.email.from}")
	private String from;
	@Value("${notification.email.message}")
	private String message;

	public void sendEmail(String to) {
		System.out.println("sending Email from : " + from);
		System.out.println("sending Email body : " + message);
		System.out.println("sending Email to : " + to);

	}

}
