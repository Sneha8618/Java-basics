package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Road extends Object {
	
	public Road() {
		System.out.println("Created Road by spring");
	}

	@Override
	public String toString() {
		return "Road [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
