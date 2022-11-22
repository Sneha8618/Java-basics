package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.ClothDTO;

public class ClothTester {
	
public static void main(String args[]) {
		
		ClothDTO cl = new ClothDTO();
		cl.setId(765);
		cl.setColor("Pink");
		cl.setPrice(345.87);
		
		System.out.println("Cloth id is" + cl.getId());
		System.out.println("Cloth color is" + cl.getColor());
		System.out.println("Cloth price is " + cl.getPrice());
		
		
	}

}



