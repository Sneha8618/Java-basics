package com.xworkz.springframework.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{
	
	public Petrol() {
		System.out.println("Created Petrol using non-arg constructor...");
	}

	
	public void consume() {
		System.out.println("running consume in petrol..");
		
	}

}
