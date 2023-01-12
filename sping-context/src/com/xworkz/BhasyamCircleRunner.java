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
		
		String string = spring.getBean(String.class);
		System.out.println(string);
		
		Float value = spring.getBean(Float.class);
		System.out.println("Value is : " + value);
		
		Double value1 = spring.getBean(Double.class);
		System.out.println("value is : " + value1);
	}

}
