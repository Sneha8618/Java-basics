package com.xworkz.airoplaneDatabase.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airoplaneDatabase.dto.AiroplaneDTO;

public interface AiroplaneService {
	
	Set<ConstraintViolation<AiroplaneDTO>> validateAndSave(AiroplaneDTO dto);

}
