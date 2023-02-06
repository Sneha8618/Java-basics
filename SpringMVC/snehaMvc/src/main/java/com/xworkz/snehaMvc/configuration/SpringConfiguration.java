package com.xworkz.snehaMvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.snehaMvc")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
