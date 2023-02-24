package com.xworkz.airoplaneDatabase.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.airoplaneDatabase.dto.AiroplaneDTO;
import com.xworkz.airoplaneDatabase.service.AiroplaneService;

@Controller
@RequestMapping("/")
public class AiroplaneController {
	
	@Autowired
	private AiroplaneService airoplaneService;
	
	public AiroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	List<String> types = Arrays.asList("light jet", "business jet", "cargo jet", "airliner", "boing", "floatplane");
	
	@GetMapping("/air")
	public String onFly(Model model) {
		System.out.println("running onFly get");
		model.addAttribute("types", types);
		return "Airoplane";
	}
	
	@PostMapping("/air")
	public String onFly(AiroplaneDTO dto, Model model) {
		System.out.println("running onFly" + dto);
		
		Set<ConstraintViolation<AiroplaneDTO>> violation = airoplaneService.validateAndSave(dto);
		if(violation.isEmpty()) {
			System.out.println("no violation, goto success page");
			return "AiroplaneSuccess";
		}
		
		model.addAttribute("types", types);
		model.addAttribute("errors", violation);
		model.addAttribute("dto", dto);
		System.err.println("violation in container");
		return "Airoplane";
	}
	
	

}
