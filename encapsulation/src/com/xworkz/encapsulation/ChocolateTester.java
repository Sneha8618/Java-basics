package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.ChocolateDTO;

public class ChocolateTester {
	
	public static void main(String args[]) {
		
		ChocolateDTO ch = new ChocolateDTO();
		ch.setId(898);
		ch.setName("Dairy milk");
		ch.setFlavour("milk");
		ch.setPrice(82.56);
		
		System.out.println("Chocolate id is " + ch.getId());
		System.out.println("Chocolate name is " + ch.getName());
		System.out.println("Chocolate flavour is " + ch.getFlavour());
		System.out.println("Chocolate price is " + ch.getPrice());
	}

}
