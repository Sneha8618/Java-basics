package com.xworkz.springframework.browser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	
	public Chrome() {
		System.out.println("Created chrome using non-argument constructor");
	}

	@Override
	public void browse() {
		System.out.println("running browse method in chrome...");
		provider.connect();
	}

}
