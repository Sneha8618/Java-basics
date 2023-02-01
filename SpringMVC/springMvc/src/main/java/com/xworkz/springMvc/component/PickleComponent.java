package com.xworkz.springMvc.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/khara")
public class PickleComponent {
	
	public PickleComponent() {
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@GetMapping 
	public String taste() {
		System.out.println("running taste.....");
		return "Pickle.jsp";
	}
	
	@PostMapping
	public String tastePost() {
		System.out.println("running tastePost...");
		return "Pickle.jsp";
	}

}