package com.xworkz.festivalDatabase.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindMainGodAndTotalDaysByName {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory  = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMainGodAndTotalDaysByName");
		query.setParameter("nm", "Christmas");
		Object obj = query.getSingleResult();
		Object[] result = (Object[])obj;
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
