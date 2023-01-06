package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Area extends Object{
	
	public Area() {
		super();
		System.out.println("Created Area by spring");
	}

	@Override
	public String toString() {
		return "Area [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
