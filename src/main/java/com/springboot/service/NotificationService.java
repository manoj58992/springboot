package com.springboot.service;

import com.springboot.DTO.NotificationDTO;

public class NotificationService {

	private EmailService emailService;

	private TextService textService;

	public void notifyMe(NotificationDTO noDto) {
		if ("TEXT".equals(noDto.getType())) {
			textService.sendText(noDto.getTo());
		} else if ("EMAIL".equals(noDto.getType())) {
			emailService.sendEmail(noDto.getTo());
		}

	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public TextService getTextService() {
		return textService;
	}

	public void setTextService(TextService textService) {
		this.textService = textService;
	}

}
