package com.xworkz.springreference;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.springreference.boot.movie.CameraMan;
import com.xworkz.springreference.boot.movie.Movie;
import com.xworkz.springreference.boot.movie.Producer;
import com.xworkz.springreference.configuration.MovieConfiguration;

public class MovieRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		CameraMan ref = spring.getBean(CameraMan.class);
		System.out.println(ref);
		
		Movie ref2 = spring.getBean(Movie.class);
		System.out.println(ref2);
		
		Producer ref3 = spring.getBean(Producer.class);
		System.out.println(ref3);
		
		
	}

}
