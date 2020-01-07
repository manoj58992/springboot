package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.DTO.NotificationDTO;
import com.springboot.DTO.TestDTO;
import com.springboot.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class TestController {

	/*
	 * @RequestMapping(value = "", method = RequestMethod.GET) public String
	 * testApp() { return "test"; }
	 * 
	 * @RequestMapping(value = "", method = RequestMethod.POST) public TestDTO
	 * tdto(@RequestBody TestDTO tdto) { return (tdto); }
	 */

	@Autowired
	private NotificationService notificationService;

	@RequestMapping(value = "", method = RequestMethod.POST)

	public String showTest(@RequestBody NotificationDTO body) {
		notificationService.notifyMe(body);

		return "Success";

	}

}
