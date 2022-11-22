package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.LaptopDTO;

public class LaptopTester {
	
	public static void main(String args[]) {
		
		LaptopDTO laptop = new LaptopDTO();
		laptop.setId(567);
		laptop.setBrand("Lenovo");
		laptop.setProcessor("i3");
		
		System.out.println("Laptop id is " + laptop.getId());
		System.out.println("Laptop brand is " + laptop.getBrand());
		System.out.println("Laptop processor type is " + laptop.getProcessor());
		
	}

}
