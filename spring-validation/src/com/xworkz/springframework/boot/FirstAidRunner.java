package com.xworkz.springframework.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.configuration.SpringConfiguration;
import com.xworkz.springframework.dto.FirstAidDTO;
import com.xworkz.springframework.service.FirstAidService;

public class FirstAidRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		FirstAidService ref = spring.getBean(FirstAidService.class);
		
		boolean saved = ref.validateAndSave(new FirstAidDTO());
		System.out.println("saved " + saved);
	}

}
