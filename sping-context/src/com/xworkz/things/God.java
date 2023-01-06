package com.xworkz.things;

import org.springframework.stereotype.Component;

@Component
public class God extends Object {
	
	public God() {
		super();
		System.out.println("Created God by spring");
	}

	@Override
	public String toString() {
		return "God [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
