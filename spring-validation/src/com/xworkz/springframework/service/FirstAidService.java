package com.xworkz.springframework.service;

import com.xworkz.springframework.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO dto);

}
