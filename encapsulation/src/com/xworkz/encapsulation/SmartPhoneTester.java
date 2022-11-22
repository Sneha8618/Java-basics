package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.SmartPhoneDTO;

public class SmartPhoneTester {

	public static void main(String args[]) {
		
		SmartPhoneDTO sm = new SmartPhoneDTO();
		sm.setId(150);
		sm.setBrand("Oppo");
		sm.setStorage("32 gb");
		sm.setPrice(20000);
		
		System.out.println("Smart phone id is " + sm.getId());
		System.out.println("Smart phone id is " + sm.getBrand());
		System.out.println("Smart phone id is " + sm.getStorage());
		System.out.println("Smart phone id is " + sm.getPrice());
		
				
	}
}
