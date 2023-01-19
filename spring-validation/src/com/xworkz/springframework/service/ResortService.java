package com.xworkz.springframework.service;

import com.xworkz.springframework.dto.ResortDTO;

public interface ResortService {
	
	boolean validateAndSave(ResortDTO dto);

}
