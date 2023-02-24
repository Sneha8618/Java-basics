package com.xworkz.airoplaneDatabase.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.airoplaneDatabase.dto.AiroplaneDTO;
import com.xworkz.airoplaneDatabase.entity.AiroplaneEntity;
import com.xworkz.airoplaneDatabase.repository.AiroplaneRepository;

@Service
public class AiroplaneServiceImpl implements AiroplaneService{
	
	@Autowired
	private AiroplaneRepository airoplaneRepository;
	

	@Override
	public Set<ConstraintViolation<AiroplaneDTO>> validateAndSave(AiroplaneDTO dto) {
		System.out.println("running validateAndSave..");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AiroplaneDTO>> violation = validator.validate(dto);
		if(violation != null && !violation.isEmpty()) {
			System.err.println("Violation in dto " + dto);
			return violation;
		}
		else {
			System.out.println("violation is not in dto, can save" );
			AiroplaneEntity entity = new AiroplaneEntity();
			entity.setA_company(dto.getCompany());
			entity.setA_name(dto.getName());
			entity.setA_cost(dto.getCost());
			entity.setA_types(dto.getTypes());
			entity.setA_country(dto.getCountry());
			
			boolean saved = this.airoplaneRepository.save(entity);
			System.out.println("Entity is saved " + saved);
			return Collections.emptySet();
		}
		
	}

}
