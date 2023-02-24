package com.xworkz.festivalDatabase.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndId {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		query.setParameter("nm", "Nagarpanchami");
		query.setParameter("i", 4);
		Object obj = query.getSingleResult();
		Object[] result = (Object[])obj;
		System.out.println(result[0]);
		System.out.println(result[1]);
		manager.close();
	}

}
