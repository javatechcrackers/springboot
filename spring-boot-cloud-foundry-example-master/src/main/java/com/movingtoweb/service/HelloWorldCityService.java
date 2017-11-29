package com.movingtoweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movingtoweb.config.ConfigurationSettings;


@RestController
@RequestMapping(value = "/rest/welcome")
public class HelloWorldCityService {

	 @Autowired
	    private ConfigurationSettings configurationSettings;
	
	
	 @RequestMapping(value = "/cityList")
	    public List<String> getCityNames() {
	        return configurationSettings.getCityNames();
	    }
}
