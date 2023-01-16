package com.xworkz.springreference;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springreference.boot.Polymath;
import com.xworkz.springreference.configuration.OptimisticConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(OptimisticConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		Polymath ref = spring.getBean(Polymath.class);
		ref.checkPropertyRef();
	}

}
