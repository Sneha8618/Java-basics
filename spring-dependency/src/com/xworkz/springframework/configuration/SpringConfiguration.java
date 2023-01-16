package com.xworkz.springframework.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springframework.bean")

public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Created spring configuration using non-arg constructor..");
	}
	
	

}
