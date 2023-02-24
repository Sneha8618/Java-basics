package com.xworkz.forestDatabasee.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.forestDatabasee.entity.ForestEntity;

public class FindByNameAndStateAndArea {
	
	public static void main(String args[]) {
		
		System.out.println("running findByNameAndStateAndArea");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndStateAndArea");
		Object obj = query.getSingleResult();
		ForestEntity entity = (ForestEntity)obj;
		System.out.println(entity);
		manager.close();
		
		
	}

}
