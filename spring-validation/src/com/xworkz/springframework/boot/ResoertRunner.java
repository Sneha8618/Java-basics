package com.xworkz.springframework.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.configuration.SpringConfiguration;
import com.xworkz.springframework.dto.ResortDTO;
import com.xworkz.springframework.service.ResortService;

public class ResoertRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ResortService ref = spring.getBean(ResortService.class);
		
		boolean saved = ref.validateAndSave(new ResortDTO());
		System.out.println("Saved repo " + saved);
	}

}
