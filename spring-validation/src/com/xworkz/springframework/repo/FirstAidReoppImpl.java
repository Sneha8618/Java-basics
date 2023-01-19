package com.xworkz.springframework.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springframework.dto.FirstAidDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component

public class FirstAidReoppImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running FirstAidDTO method");
		System.out.println("Dto " + dto);
		return true;
	}
	
	

}
