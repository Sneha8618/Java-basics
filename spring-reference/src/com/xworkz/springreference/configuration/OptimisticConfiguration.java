package com.xworkz.springreference.configuration;

import java.util.Collection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springreference", excludeFilters = { 
		      @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Collection.class) }) 

public class OptimisticConfiguration {
	
	public OptimisticConfiguration() {
		System.out.println("Created OptimisticConfiguration by non-arg constructor..");
	}
	
	

}
