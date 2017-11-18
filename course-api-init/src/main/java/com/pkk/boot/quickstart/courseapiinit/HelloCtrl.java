package com.pkk.boot.quickstart.courseapiinit;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkk.boot.topic.Topic;

@RestController
public class HelloCtrl {
	@RequestMapping("/")
	public String getAllTopic(){
		return "Hello";
	}
}
