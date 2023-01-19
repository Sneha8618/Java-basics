package com.xworkz.springframework.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springframework.dto.MissileDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class MissileRepoImpl implements MissileRepo {

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save method..");
		System.out.println("Dto " + dto);
		return true;
	}

}
