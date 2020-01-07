package com.springboot.service;

import org.springframework.beans.factory.annotation.Value;

public class TextService {
	@Value("${notification.text.from}")
	private String from;
	@Value("${notification.text.message}")
	private String message;

	public void sendText(String to) {
		System.out.println("sending text from : " + from);
		System.out.println("sending text body : " + message);
		System.out.println("sending text to : " + to);
	}
}
