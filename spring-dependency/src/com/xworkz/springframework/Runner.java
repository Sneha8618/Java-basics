package com.xworkz.springframework;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.xworkz.springframework.bean.PetrolBunk;
import com.xworkz.springframework.bean.Shell;
import com.xworkz.springframework.browser.Chrome;
//import com.xworkz.springframework.browser.Browser;
import com.xworkz.springframework.browser.FireFox;
import com.xworkz.springframework.configuration.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		Shell ref = spring.getBean(Shell.class);
		ref.purchase();
		
		FireFox ref1 = spring.getBean(FireFox.class);
		ref1.browse();
		
		Chrome ref2 = spring.getBean(Chrome.class);
		ref2.browse();
		
		
		
		
	}

}
