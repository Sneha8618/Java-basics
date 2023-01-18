package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImpl implements SoldierService{
	
	private SoldierRepo soldierRepo;
	
	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no-args constructor");
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo;
	}

	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("starting validateAndSave method ");
		System.out.println("Dto " + dto);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("There are some validation errors..");
			
			violation.forEach(v -> {
				System.err.println("Violating message" + v.getMessage());
			});
			return false;
		}
		
		else {
			System.out.println("Validation is done...");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo " + saved);
			return saved;
		}
		
	}

}
