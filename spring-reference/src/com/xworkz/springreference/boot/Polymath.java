package com.xworkz.springreference.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Polymath {
	
	@Autowired
	private Colonel colonel;
	
	public Polymath() {
		System.out.println("Creating Polymath non-arg constructor..");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.colonel.hashCode()   + " hash code of ref");
	}

}
