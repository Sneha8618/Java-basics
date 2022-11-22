package com.xworkz.encapsulation;

import com.xworkz.encapsulation.cricketplayer.CricketPlayerDTO;

public class CricketPlayerTester {
	
	public static void main(String args[]) {
		
		CricketPlayerDTO crc = new CricketPlayerDTO();
		crc.setId(345);
		crc.setName("Rohit sharma");
		crc.setTeamName("India");
		
		System.out.println("player id is " + crc.getId());
		System.out.println("player name is " + crc.getName());
		System.out.println("player team is " + crc.getTeamName());
		
		}

}
