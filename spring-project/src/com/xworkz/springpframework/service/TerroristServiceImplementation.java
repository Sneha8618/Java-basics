package com.xworkz.springpframework.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
//import javax.xml.bind.Validator;

import com.xworkz.springpframework.dto.TerroristDTO;

public class TerroristServiceImplementation implements TerroristService {
	
	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		
		System.out.println("executing validateAndSave start");
		System.out.println("Dto passed " + dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error is there");
			violations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		}
		else {
			System.out.println("Validation is successfull");
			return true;
		}
		
		
	}
	
	

}
