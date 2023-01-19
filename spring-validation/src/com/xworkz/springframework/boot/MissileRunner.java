package com.xworkz.springframework.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.configuration.SpringConfiguration;
import com.xworkz.springframework.dto.MissileDTO;
import com.xworkz.springframework.service.MissileService;

public class MissileRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		MissileService ref = spring.getBean(MissileService.class);
		
		boolean saved = ref.validateAndSave(new MissileDTO());
		System.out.println("Saved repo " + saved);
	}

}
