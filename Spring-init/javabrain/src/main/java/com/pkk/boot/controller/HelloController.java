package com.pkk.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/helloCtrl")
	public String sayHI(){
		return "Hi";
	}
	
}
