package com.xworkz.egg.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.stereotype.Service;
import com.xworkz.egg.dto.CMDTO;

@Service
public class CMServiceImpl implements CmService{
	
	public CMServiceImpl() {
	   System.out.println("Cretaed " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto) {
		System.out.println("Created " +this.getClass().getSimpleName());
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolation = validator.validate(dto);
		if(constraintViolation != null && !constraintViolation.isEmpty()) {
			System.err.println("constraintViolation exist, return constraintViolation errors");
			return constraintViolation;
		}
		else{
			System.out.println("constraintVilation does not exist, data is good");
			return Collections.emptySet();
		}
		
	}

}
