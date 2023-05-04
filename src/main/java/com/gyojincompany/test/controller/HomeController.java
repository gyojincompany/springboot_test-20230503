package com.gyojincompany.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.test.dto.MemberDto;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello";
	}
	
	
	
}
