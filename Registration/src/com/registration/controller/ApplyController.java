package com.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registration.service.TestService;

@Controller
@RequestMapping("/application")
public class ApplyController {
	@Autowired
	private TestService testService;
	@RequestMapping("/submit")
	public void submitApplication(){
		testService.showMsg();
	}
}
