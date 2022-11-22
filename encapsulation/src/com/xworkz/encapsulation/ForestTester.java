package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.ForestDTO;

public class ForestTester {
	
	public static void main(String args[]) {
		
		ForestDTO fr = new ForestDTO();
		fr.setId(456);
		fr.setName("Amazon forest");
		fr.setCity("Delhi");
		
		System.out.println("Forest id is " + fr.getId());
		System.out.println("Forest name is " + fr.getName());
		System.out.println("Forest id is " + fr.getCity());
	}

}
