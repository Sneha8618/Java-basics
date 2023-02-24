package com.xworkz.festivalDatabase.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festivalDatabase.entity.FestivalEntity;

public class PersistenceRunner {

	public static void main(String[] args) {

		System.out.println("Running persistence runner");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		FestivalEntity entity1 = new FestivalEntity("Sankranti", "Karnataka", 2, "Holige", "Ganga");
		FestivalEntity entity2 = new FestivalEntity("Ugadi", "Andrapradesh", 3, "Yellubella", "Shiva");
		FestivalEntity entity3 = new FestivalEntity("Shivaratri", "Goa", 1, "Sabudani", "Shiva");
		FestivalEntity entity4 = new FestivalEntity("Nagarpanchami", "Karnataka", 4, "Undi", "Nagarhavu");
		FestivalEntity entity5 = new FestivalEntity("GaneshChaturthi", "Maharastra", 5, "Karchikayi", "Ganesh");
		FestivalEntity entity6 = new FestivalEntity("Dasara", "Karnataka", 9, "Papadi", "Durgadevi");
		FestivalEntity entity7 = new FestivalEntity("Deepavali", "Karnataka", 6, "Holige", "Lakshmi");
		FestivalEntity entity8 = new FestivalEntity("Onam", "Keral", 1, "Holige", "Ganga");
		FestivalEntity entity9 = new FestivalEntity("Pongal", "Andrapradesh", 5, "Avlakki", "devi");
		FestivalEntity entity10 = new FestivalEntity("Bakrid", "Pakistan", 30, "Nonveg", "syed");
		FestivalEntity entity11 = new FestivalEntity("Holi", "Karnataka", 4, "Kadalekalu", "Kamanna");
		FestivalEntity entity12 = new FestivalEntity("Gandhijayanti", "Karnataka", 1, "Peda", "Gandhi");
		FestivalEntity entity13 = new FestivalEntity("RaskhaBandhan", "Rajsthan", 3, "Burfie", "Anna");
		FestivalEntity entity14 = new FestivalEntity("GurunanakJayanti", "Delhi", 1, "Sheera", "Gurunanak");
		FestivalEntity entity15 = new FestivalEntity("IndpendenceDay", "India", 1, "Chocolates", "BharatMata");
		FestivalEntity entity16 = new FestivalEntity("Ramzan", "Mizoram", 10, "Biriyani", "Murtuza");
		FestivalEntity entity17 = new FestivalEntity("Christmas", "America", 7, "Cakaes", "Yesu");
		FestivalEntity entity18 = new FestivalEntity("GoodFriday", "Japan", 15, "Cookies", "Krishta");
		FestivalEntity entity19 = new FestivalEntity("KrishnaJanmashtami", "India", 20, "Benni", "Krishna");
		FestivalEntity entity20 = new FestivalEntity("GouriHabba", "Mumbai", 16, "SakkriGombi", "Gouri");
		FestivalEntity entity21 = new FestivalEntity("RepublicDay", "India", 1, "Holige", "Maata");
		FestivalEntity entity22 = new FestivalEntity("ChildernsDay", "Tripura", 38, "Chocolates", "JavahralaNeharu");
		FestivalEntity entity23 = new FestivalEntity("TeachersDay", "Karnataka", 24, "Sajaka", "RadhaKrishanan");
		FestivalEntity entity24 = new FestivalEntity("Rayostav", "Karnataka", 1, "laadu", "Bharatmata");
		FestivalEntity entity25 = new FestivalEntity("Newyear", "Foriegn", 45, "Jamunu", "Ganga");

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
		manager.persist(entity11);
		manager.persist(entity12);
		manager.persist(entity13);
		manager.persist(entity14);
		manager.persist(entity15);
		manager.persist(entity16);
		manager.persist(entity17);
		manager.persist(entity18);
		manager.persist(entity19);
		manager.persist(entity20);
		manager.persist(entity21);
		manager.persist(entity22);
		manager.persist(entity23);
		manager.persist(entity24);
		manager.persist(entity25);
		transaction.commit();
		manager.close();

	}

}
