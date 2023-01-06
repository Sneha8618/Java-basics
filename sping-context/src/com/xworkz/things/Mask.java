package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Mask extends Object {
	
	public Mask() {
		super();
		System.out.println("Created Mask by spring");
	}

	@Override
	public String toString() {
		return "Mask [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
