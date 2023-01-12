package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")

public class SpringConfiguration {
	
	@Bean
	public String chair() {
		System.out.println("Registering chair with string..");
	    String string = new String("Sneha");
        return string;
	}
	
	@Bean
	public Float id() {
		System.out.println("Registering id with float..");
		Float value = new Float(5);
		return value;
	}
	
	@Bean
	public Double value() {
		System.out.println("Registering value with doublee..");
		Double value1 = new Double(30.5);
		return value1;
	}

}
