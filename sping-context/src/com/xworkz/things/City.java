package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class City extends Object{
	
	@Override
	public String toString() {
		return "City [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public City() {
		super();
		System.out.println("Created City by spring");
	}

}
