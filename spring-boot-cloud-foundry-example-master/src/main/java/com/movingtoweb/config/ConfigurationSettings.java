package com.movingtoweb.config;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationSettings {

    @Value("${config.app.name}")
    private String name;

    @Value("${greeting}")
    private String greeting;
    
    @Value("${config.app.names}")
    private String cityNames;

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

	public List<String> getCityNames() {
		ArrayList<String> city = new ArrayList<>() ;
		String tokenStr = null;
		StringTokenizer token = new StringTokenizer(cityNames, ",");
		while(token.hasMoreElements()){
			tokenStr = (String) token.nextElement();
			System.out.println(tokenStr);
			city.add(tokenStr);
			
		}
		return city;
	}
}
