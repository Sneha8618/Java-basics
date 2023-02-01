package com.xworkz.springMvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/buy")

public class Rupee {
	
	public Rupee() {
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String onTest() {
		System.out.println("running onTest....");
		return "index.jsp";
	}
	
	

}
