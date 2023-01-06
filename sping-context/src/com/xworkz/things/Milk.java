package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Milk extends Object {
	
	public Milk() {
		super();
		System.out.println("Created Milk by spring");
	}

	@Override
	public String toString() {
		return "Milk [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
