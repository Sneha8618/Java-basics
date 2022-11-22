package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.EcommarceDTO;

public class EcommarceTester {
	
	public static void main(String args[]) {
		
		EcommarceDTO ec = new EcommarceDTO();
		ec.setId(554);
		ec.setName("Azio");
		ec.setNoOfProducts(76);
		
		System.out.println("Ecommarce id is " + ec.getId());
		System.out.println("Ecommarce name is " + ec.getName());
		System.out.println("Ecommarce no of products are " + ec.getNoOfProducts());
	}

}
