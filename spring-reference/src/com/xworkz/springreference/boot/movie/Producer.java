package com.xworkz.springreference.boot.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private Assistant assistant;
	
	public Producer() {
		System.out.println("Created producer by non-arg constructor..");
	}
	
	public void checkAssRef() {
		System.out.println(this.assistant.hashCode()  + " hashcode of ref");
	}

}
