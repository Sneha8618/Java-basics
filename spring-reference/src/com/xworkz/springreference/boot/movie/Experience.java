package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	@Autowired
	private Skill skill; 
	
	public Experience() {
		System.out.println("Created experience by non-argument constructor..");
	}
	
	

}
