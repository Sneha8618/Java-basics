package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Autowired 
	private Area area;
	
	public Location() {
		System.out.println("Created location by non-argument constructor..");
	}

}
