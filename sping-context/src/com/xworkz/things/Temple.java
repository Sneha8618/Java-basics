package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Temple extends Object{
	
	public Temple() {
		super();
		System.out.println("Created Temple by spring");
	}

	@Override
	public String toString() {
		return "Temple [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
