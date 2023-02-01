package com.xworkz.fooditem.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.fooditem")

public class FoodConfiguration {
	
	public FoodConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
