package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	@Autowired
	private Lense lense;
	
	
	
	public Camera() {
		System.out.println("Created Camera by non-argumented constructor...");
	}
	
	
	

}
