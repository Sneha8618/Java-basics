package com.xworkz.springframework.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public FireFox() {
		System.out.println("Created firefox using non-argumeny constructor..");
	}

	@Override
	public void browse() {
		System.out.println("running browse method in firefox");
		provider.connect();
	}
	

}
