package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Patient extends Object{
	
	public Patient() {
		super();
		System.out.println("Created Patient by spring");
	}

	@Override
	public String toString() {
		return "Patient [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
