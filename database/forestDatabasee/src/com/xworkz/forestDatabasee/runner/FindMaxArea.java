package com.xworkz.forestDatabasee.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxArea {
	
public static void main(String args[]) {
	
	    System.out.println("running FindMaxArea");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findMaxArea");
		Object obj = query.getSingleResult();
		Double area = (Double)obj;
		System.out.println(area);
		manager.close();
		
		
	}

}
