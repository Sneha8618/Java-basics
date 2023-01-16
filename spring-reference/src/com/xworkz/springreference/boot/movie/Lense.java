package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lense {
	
	@Autowired
	private Battery battery;
	
	
	public Lense() {
		System.out.println("Created Lense by non-argumented constructor...");
	}
	
	
	
	
	
	

}
