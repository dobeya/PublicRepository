package com.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.registration.po.User;
import com.registration.service.TestService;
import com.registration.tools.ResponseUtils;

@Controller
@RequestMapping("/application")
public class ApplyController {
	@Autowired
	private TestService testService;
	@RequestMapping("/submit")
	public void submitApplication(HttpServletRequest request,HttpServletResponse response){
		User user = new User();
		user.setAddress("µÿ÷∑");
		user.setEmail("email");
		user.setId("123456");
		user.setCity("≥« –");
		ResponseUtils.writeJson(response, JSON.toJSONString(user));
	}
}
