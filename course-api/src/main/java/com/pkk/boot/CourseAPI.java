package com.pkk.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties
@SpringBootApplication
public class CourseAPI {

	@Value("${prefix.stringProp1}")
	 private static String stringProp1;
	
	public static void main(String[] args) {
		System.out.println("stringProp1 = " + stringProp1);
		SpringApplication.run(CourseAPI.class, args);

	}

}
