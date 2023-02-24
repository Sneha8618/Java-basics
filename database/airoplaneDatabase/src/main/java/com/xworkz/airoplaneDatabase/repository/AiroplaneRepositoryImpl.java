package com.xworkz.airoplaneDatabase.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airoplaneDatabase.entity.AiroplaneEntity;

@Repository

public class AiroplaneRepositoryImpl implements AiroplaneRepository{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(AiroplaneEntity entity) {
		System.out.println("running save");
		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}

	

}
