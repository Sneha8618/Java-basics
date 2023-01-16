package com.xworkz.springframework.browser;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{
	
	
	public Airtel() {
		System.out.println("Created airtel using non-arument consructor");
	}

	public void connect() {
		System.out.println("running connect method in airtel");
		
	}

}
