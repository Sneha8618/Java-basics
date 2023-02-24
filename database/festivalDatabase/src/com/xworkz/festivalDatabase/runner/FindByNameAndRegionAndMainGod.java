package com.xworkz.festivalDatabase.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festivalDatabase.entity.FestivalEntity;

public class FindByNameAndRegionAndMainGod {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndRegionAndMainGod");
		Object obj = query.getSingleResult();
		FestivalEntity entity = (FestivalEntity)obj;
		System.out.println(entity);
		manager.close();
		
	}

}
