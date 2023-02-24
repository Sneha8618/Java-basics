package com.xworkz.forestDatabasee.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindStateByNameAndArea {
	
public static void main(String args[]) {
	
	     System.out.println("running findStateByNameAndArea");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findStateByNameAndArea");
		Object obj = query.getSingleResult();
		String state = (String)obj;
		System.out.println(state);
		manager.close();
		
		
	}

}
