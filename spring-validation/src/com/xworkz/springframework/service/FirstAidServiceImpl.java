package com.xworkz.springframework.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springframework.dto.FirstAidDTO;
import com.xworkz.springframework.repo.FirstAidRepo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidServiceImpl implements FirstAidService {
	
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
	}

	
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running validateAndSave method..");
		System.out.println("dto " + dto);
		
		Set<ConstraintViolation<FirstAidDTO>> violation = this.validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("There are violation errors..");
			violation.forEach(v -> System.err.println(v.getMessage()));
			return false;
		}
		else {
			System.out.println("Validation is done..");
			boolean saved = this.firstAidRepo.save(dto);
			System.out.println("Saved first aid " + saved);
			return saved;
		}
		
	}
	
	

}
