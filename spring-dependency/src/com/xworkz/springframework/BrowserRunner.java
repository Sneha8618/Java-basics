package com.xworkz.springframework;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.browser.Browser;
import com.xworkz.springframework.browser.Chrome;
import com.xworkz.springframework.browser.FireFox;
import com.xworkz.springframework.browser.Jio;
import com.xworkz.springframework.configuration.BrowseConfiguration;

public class BrowserRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(BrowseConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		FireFox ref = spring.getBean(FireFox.class);
		ref.browse();
		
		Chrome ref1 = spring.getBean(Chrome.class);
		ref1.browse();
		
		
		
	}

}
