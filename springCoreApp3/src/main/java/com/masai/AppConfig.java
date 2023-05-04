package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {

	
	@Bean
	public List<String> getCities(){
		
		List<String> cities=new ArrayList<>();
		
		cities.add("delhi");
		cities.add("Haldwani");
		cities.add("Pune");
		cities.add("Doon");
		cities.add("Banglore");
		
		return cities;
		
	}
}
