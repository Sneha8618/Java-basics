package com.xworkz.springframework.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	public Jio() {
		System.out.println("Created jio using non-argument constructor..");
	}
	
	public void connect() {
		System.out.println("running connect method in jio..");
		
		
	}

}
