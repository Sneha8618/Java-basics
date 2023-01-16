package com.xworkz.springframework.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
	
	public Diesel() {
		System.out.println("Created diesel using non-arg constructor..");
	}

	
	public void consume() {
		System.out.println("running consume in deisel...");
		
	}

}
