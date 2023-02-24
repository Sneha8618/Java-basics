package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CMDTO;
import com.xworkz.egg.service.CmService;

@Controller
@RequestMapping("/cm")

public class CMController {
	
	@Autowired
	private CmService cmService;
	
	public CMController() {
		System.out.println("Created " +this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCM(CMDTO dto, Model model) {
		System.out.println("running onCM.. "+dto);
		Set<ConstraintViolation<CMDTO>> contraintViolation = this.cmService.validateAndSave(dto);
		if(!contraintViolation.isEmpty()) {
			System.out.println("Validation failed, display error message");
			contraintViolation.forEach((cv) -> System.err.println(cv.getMessage()));
		}
		else {
			System.out.println("validation success, display success message");
		}
		
		return "Cm";
	}

}
