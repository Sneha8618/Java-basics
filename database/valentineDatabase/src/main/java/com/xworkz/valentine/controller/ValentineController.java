package com.xworkz.valentine.controller;

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

import com.xworkz.valentine.dto.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/")

public class ValentineController {
	
	@Autowired
	private ValentineService valentineService;
	
	List<String> places = Arrays.asList("Cubbon park", "Lalbag", "BTM", "Xworkz", "Gayatrinagar", "JP nagar", "Indira nagar");
	
	List<String> gifts = Arrays.asList("I-phone", "Chocolate", "Saree", "Teddy");
	
	public ValentineController() {
		System.out.println("Created " +this.getClass().getSimpleName());
	}
	
	@GetMapping("/valentine")
	public String onValentine(Model model) {
		
		System.out.println("running onValentine get method..");
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		
		return "Valentine";
	}
	
	@PostMapping("/valentine")
	public String onValentine(ValentineDTO dto, Model model) {
		System.out.println("running onValentine post method " + dto);
		
		Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			return "ValentineSuccess";
		}
		
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("violation in container");
		return "Valentine";
	}
	
	
	

}
