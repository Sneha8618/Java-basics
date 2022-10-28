package com.xworkz.medicalapp;

import java.util.Scanner;

//import package + classname = FQCN - fully qualified class name;
import com.xworkz.medicalapp.medicalshop.TeaStall;

public class TeaStallBlock {
	
	public int id;
	public String name;
	
	public TeaStallBlock(int id, String name) {
		System.out.println("TeaStallBlock constructor is called");
		this.id= id;
		this.name = name;
	}
	
	static {
		System.out.println("static blocks are executing");
	}
	
	{
		System.out.println("Init block are executed");
	}
	
	public static void method() {
		System.out.println("static method ");
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Main method is started");
		TeaStallBlock test = new TeaStallBlock(1, "someone");
		System.out.println(test.name + " "+ test.id);
		System.out.println("main method ended");
		
		
	}

}
