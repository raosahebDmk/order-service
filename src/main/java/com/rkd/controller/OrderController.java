package com.rkd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@RequestMapping("/")
	public String m1()
	{
		return "spring boot : order service...";
	}
	
	@RequestMapping("/order")
	public String m2()
	{
		return "Java, Spring boot";
	}
	
}
