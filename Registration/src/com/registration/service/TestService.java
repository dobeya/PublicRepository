package com.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.dao.TestMapper;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	public void showMsg(){
		testMapper.selectUserByID(1);
	}
}
