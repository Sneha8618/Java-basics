package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Fish extends Object {
	
	public Fish() {
		
		super();
		System.out.println("Created Fish by spring");
	}

	@Override
	public String toString() {
		return "Fish [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
