package com.registration.controller;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.registration.service.TestService;

@Controller
@RequestMapping("/regist")
public class RegistController {
	@Autowired
	private TestService test;
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;
	@RequestMapping("/test")
	public void showMsg(){
		System.out.println("\nHEHEHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHello\n");
		test.showMsg();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		sqlSessionTemplate.selectOne("commonDAO.getInt");
	}
}
