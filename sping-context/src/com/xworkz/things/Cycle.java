package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	
	public Cycle() {
		super();
		System.out.println("Created Cycle by spring");
	}

	@Override
	public String toString() {
		return "Cycle []";
	}
	
	

}
