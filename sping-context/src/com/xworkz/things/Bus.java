package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	public Bus() {
		
		System.out.println("Created Bus by spring");
	}

	@Override
	public String toString() {
		return "Bus []";
	}
	
	

}
