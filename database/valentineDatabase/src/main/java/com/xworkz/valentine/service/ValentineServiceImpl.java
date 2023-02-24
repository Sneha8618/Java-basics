package com.xworkz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService{
	
	@Autowired
	private ValentineRepository valentineRepository;
	
	public ValentineServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("running validateAndSave");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<ValentineDTO>> violation = validator.validate(dto);
		if(violation != null && !violation.isEmpty()) {
			System.err.println("violation in dto " + dto);
			return violation;
		}
		else {
			System.out.println("violation is not there in dto, can save " );
			ValentineEntity entity = new ValentineEntity();
			entity.setV_name(dto.getName());
			entity.setV_name(dto.getValentineName());
			entity.setV_places(dto.getPlaces());
			entity.setV_gifts(dto.getGifts());
			
			boolean saved = this.valentineRepository.save(entity);
			System.out.println("Entity is saved " + saved);
			return Collections.emptySet();
		}
		
		
	}

}
