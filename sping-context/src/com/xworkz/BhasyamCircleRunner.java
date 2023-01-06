package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SpringConfiguration;
import com.xworkz.things.BhasyamCircle;

public class BhasyamCircleRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		BhasyamCircle ref = spring.getBean(BhasyamCircle.class);
		System.out.println(ref);
	}

}
