package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class Mall extends Object{
	
	public Mall() {
		super();
		System.out.println("Created Mall by spring");
	}

	@Override
	public String toString() {
		return "Mall [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
