package com.xworkz.springpframework;

import com.xworkz.springpframework.dto.TerroristDTO;
import com.xworkz.springpframework.service.TerroristService;
import com.xworkz.springpframework.service.TerroristServiceImplementation;

public class Runner {
	
	public static void main(String[] args) {
		
		TerroristDTO dto = new TerroristDTO("Anu", 23, "India", true, false, "Firering", "Xworkz");
		System.out.println(dto);
		
		TerroristService service = new TerroristServiceImplementation();
		service.validateAndSave(dto);
		
		
	}

}
