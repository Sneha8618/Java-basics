package com.xworkz.forestDatabasee.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.forestDatabasee.entity.ForestEntity;

public class PersistenceRunner {
	
	public static void main(String args[]) {
		
		System.out.println("Running persistence runner");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		ForestEntity entity1 = new ForestEntity(0, "Amazon", "Karntaka", "boreal", 4678D);
		ForestEntity entity2 = new ForestEntity(0, "Giri NationalPark", "Keral", "tropical", 567D);
        ForestEntity entity3 = new ForestEntity(0, "Bandipur", "Kashmir", "temperate", 258D);
		ForestEntity entity4 = new ForestEntity(0, "Molai", "Karnatka", "boreal", 112D);
	    ForestEntity entity5 = new ForestEntity(0, "Sundarbans", "Tamilnadu", "temperate", 478D);
        ForestEntity entity6 = new ForestEntity(0, "Annekal", "Andhra", "tropical", 147D);
		ForestEntity entity7 = new ForestEntity(0, "Evergreen", "Keral", "temperate", 968D);
		ForestEntity entity8 = new ForestEntity(0, "Mangroves", "Maharastra", "boreal", 698D);
     	ForestEntity entity9 = new ForestEntity(0, "Jakanari", "Keral", "tropical", 555D);
		ForestEntity entity10 = new ForestEntity(0, "Kukrail", "Tamilnadu", "boreal", 333D);
		
		transaction.begin();
		manager.persist(entity1);
		manager.persist(entity2);
		manager.persist(entity3);
		manager.persist(entity4);
		manager.persist(entity5);
		manager.persist(entity6);
		manager.persist(entity7);
		manager.persist(entity8);
		manager.persist(entity9);
		manager.persist(entity10);
		transaction.commit();
	}

}
