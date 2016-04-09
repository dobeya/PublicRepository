package com.registration.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class RegistController {
	@RequestMapping("/regist")
	public void regist(HttpServletRequest req,HttpServletResponse res){
		
	}
}
