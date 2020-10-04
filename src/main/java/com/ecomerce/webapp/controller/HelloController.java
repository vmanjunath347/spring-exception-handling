package com.ecomerce.webapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String helloWorld() {
		return  "Hello, to New Spring Boot App";
	}

}