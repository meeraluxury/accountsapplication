package com.meeraluxury.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello(){
		return "Hello...1.efedssuman1";
	}

}
