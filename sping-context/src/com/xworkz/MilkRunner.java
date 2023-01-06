package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.things.Milk;

public class MilkRunner {
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Milk ref = spring.getBean(Milk.class);
	System.out.println(ref);
	
	}

}
