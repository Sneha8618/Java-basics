package com.xworkz.springreference.boot;

import org.springframework.stereotype.Component;

@Component
public class Colonel {
	
	public Colonel() {
		System.out.println("Creating Colenel non-arg constructor...");
	}
	
	@Override
	public int hashCode() {
		
		return 50;
	}
}
