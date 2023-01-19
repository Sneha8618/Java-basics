package com.xworkz.springframework.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springframework.dto.ResortDTO;
import com.xworkz.springframework.repo.ResortRepo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortServiceImpl implements ResortService{
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("running validateAndSave method");
		System.out.println("Dto " + dto);
		
		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("There are no violation errors..");
			
			violation.forEach(v -> System.err.println(v.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid..");
			boolean saved = this.resortRepo.save(dto);
			System.out.println("saved " + saved);
			return saved;
		}
		
	}

}
