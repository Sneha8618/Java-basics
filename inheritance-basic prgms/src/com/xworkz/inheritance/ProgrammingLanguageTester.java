package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Java;
import com.xworkz.inheritance.fruit.ProgrammingLanguage;

public class ProgrammingLanguageTester {
	
public static void main(String[] args) {
		
		ProgrammingLanguage pl = new ProgrammingLanguage();
		pl.toDevelopApps("Charles Babbage");
		System.out.println("Programming Founder is..."+pl.Founder);
		
		Java jv = new Java();
		jv.toDevelopApps("James gosling and his team");
		System.out.println("Java Program is used by.."+jv.Founder);

	}

}
