package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Girl {
	
	public Girl() {
		
		System.out.println("Created Girl by spring");
	}

	@Override
	public String toString() {
		return "Girl []";
	}

}
