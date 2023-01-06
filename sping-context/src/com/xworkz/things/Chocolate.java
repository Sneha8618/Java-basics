package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Chocolate extends Object{
	
	public Chocolate() {
		super();
		System.out.println("Created Chocolate by spring");
	}

	@Override
	public String toString() {
		return "Chocolate [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
