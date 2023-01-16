package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	private Location location;
	
	public Company() {
		System.out.println("Created company by non-arg constructor..");
	}

}
