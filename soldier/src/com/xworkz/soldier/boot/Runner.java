package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;

import com.xworkz.soldier.service.SoldierServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		
		SoldierDTO dto = new SoldierDTO("Sanket", 2, "FirstRank", "BGMIT", "India");
		
		SoldierServiceImpl service = new SoldierServiceImpl();
		SoldierRepo repo = new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
		
		
	}

}
