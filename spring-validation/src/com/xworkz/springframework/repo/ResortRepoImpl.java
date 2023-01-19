package com.xworkz.springframework.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springframework.dto.ResortDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortRepoImpl implements ResortRepo{

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("ruuning save method..");
		System.out.println("Dto : " + dto);
		return true;
	}

}
