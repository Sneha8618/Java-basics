package com.xworkz.things;

public class Park extends Object{
	
	public Park() {
		super();
		System.out.println("Created Park by spring");
	}

	@Override
	public String toString() {
		return "Park [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
