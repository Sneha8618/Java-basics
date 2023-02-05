package com.xworkz.goaMvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goaMvc.dto.CasinoDTO;

@Component
@RequestMapping("/enjoy")
public class CasinoController {
	
	public CasinoController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doGambling(CasinoDTO dto, Model model) {
		System.out.println("running doGambling.." + dto);
		model.addAttribute("Name : " , dto.getName());
		model.addAttribute("EntryFee : " , dto.getEntryFee());
		
		//model.addAttribute("Name : ",  dto.getName());
		//model.addAttribute("EntryFee : ", dto.getEntryFee());
		
		return "CasinoSuccess.jsp";
	}

}
