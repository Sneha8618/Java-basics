package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Director director;
	
	public Movie() {
		System.out.println("Created Movie by non-argumented constructor..");
	}
	
	

}
