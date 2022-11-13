package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Runmachine;

public class RunmachineTester {
	
  public static void main(String args[]) {
		
        Runmachine run = new Runmachine();
		run.toPlay("Cricket");
		System.out.println(" Virat is good at playing "  + run.name);
	}

}
