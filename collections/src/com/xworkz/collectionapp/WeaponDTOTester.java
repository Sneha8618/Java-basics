package com.xworkz.collectionapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeaponDTOTester {
	
	public static void main(String[] args) {
		
		WeaponDTO weapon1=new WeaponDTO("Stick", "Sneha", LocalDate.of(2000, 1, 10), 10,Typee.Silver); 
		WeaponDTO weapon2=new WeaponDTO("Knife", "Vishala", LocalDate.of(2001, 2, 4), 20,Typee.Iron); 
		WeaponDTO weapon3=new WeaponDTO("Blade", "Swati", LocalDate.of(2022, 12, 17), 30,Typee.Plastic); 
		WeaponDTO weapon4=new WeaponDTO("Ax", "Sneha", LocalDate.of(1996, 3, 21), 40,Typee.Gold); 
		WeaponDTO weapon5=new WeaponDTO("Sword", "Manu", LocalDate.of(1857, 8, 10), 50,Typee.Silver); 
		WeaponDTO weapon6=new WeaponDTO("Spear", "Sahana", LocalDate.of(2000, 1, 10), 60,Typee.Iron); 
		WeaponDTO weapon7=new WeaponDTO("Pike", "Subbi", LocalDate.of(2010, 10, 30), 70,Typee.Plastic); 
		WeaponDTO weapon8=new WeaponDTO("Lance", "Sneha", LocalDate.of(2020, 8, 10), 80,Typee.Gold); 
		WeaponDTO weapon9=new WeaponDTO("Halberd", "Kashu", LocalDate.of(2022, 1, 11), 90,Typee.Silver); 
		WeaponDTO weapon10=new WeaponDTO("Boomerang", "Akshata", LocalDate.of(2023, 5, 1), 100,Typee.Iron); 
		WeaponDTO weapon11=new WeaponDTO("Crossbow", "Shilpa", LocalDate.of(2000, 1, 10), 110,Typee.Plastic); 
		WeaponDTO weapon12=new WeaponDTO("Bolo", "Asha", LocalDate.of(2004, 12, 12), 120,Typee.Gold);
		WeaponDTO weapon13=new WeaponDTO("Flamethrower", "Sneha", LocalDate.of(2006, 9, 16), 130,Typee.Silver); 
		WeaponDTO weapon14=new WeaponDTO("Grenade", "Shankar", LocalDate.of(1999, 3, 16), 140,Typee.Iron); 
		WeaponDTO weapon15=new WeaponDTO("Missele", "Shreedhara", LocalDate.of(1978, 7, 11), 150,Typee.Plastic); 
		WeaponDTO weapon16=new WeaponDTO("Rifle", "Sneha", LocalDate.of(2000, 1, 10), 160,Typee.Gold); 
		WeaponDTO weapon17=new WeaponDTO("Rocket", "Sanvi", LocalDate.of(2004, 10, 10), 170,Typee.Silver); 
		WeaponDTO weapon18=new WeaponDTO("Pinna", "Sanjana", LocalDate.of(1999, 3, 19), 180,Typee.Iron); 
		WeaponDTO weapon19=new WeaponDTO("Shotgun", "Soujanya", LocalDate.of(2000, 1, 10), 190,Typee.Plastic); 
		WeaponDTO weapon20=new WeaponDTO("Revolver", "Sannidhi", LocalDate.of(1967, 6, 18), 200,Typee.Gold); 
		
		Collection<WeaponDTO> collection = new ArrayList();
		collection.add(weapon1);
		collection.add(weapon2);
		collection.add(weapon3);
		collection.add(weapon4);
		collection.add(weapon5);
		collection.add(weapon6);
		collection.add(weapon7);
		collection.add(weapon8);
		collection.add(weapon9);
		collection.add(weapon10);
		collection.add(weapon11);
		collection.add(weapon12);
		collection.add(weapon13);
		collection.add(weapon14);
		collection.add(weapon15);
		collection.add(weapon16);
		collection.add(weapon17);
		collection.add(weapon18);
		collection.add(weapon19);
		collection.add(weapon20);
		
		System.out.println("All weapons by price greater than ....");
		collection
		.stream()
		.map((e) -> {
			if(e.getPrice() > 50) 
				return e; 
				return "NA" ; })
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("All weapons by made by and made on....");
		collection
		.stream()
		.map(e -> e.getMadeBy())
		//.map(e -> e.getMadeOn(weapon21))
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapon names in desc order.....");
		collection
		.stream()
		.sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapons made by in asc order..."); 
		collection
		.stream()
		.sorted((a1, a2) -> a1.getMadeBy().compareTo(a2.getMadeBy()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapons made on in asc order...");
		collection
		.stream()
		.sorted((a1, a2) -> a1.getMadeOn().compareTo(a2.getMadeOn()))
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapons by price in asc order");
		Comparator<WeaponDTO> comparator = (a1, a2) ->  Double.compare(a1.getPrice(), a2.getPrice());
		collection
		.stream()
		.sorted(comparator)
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapons by price in desc order....");
		Comparator<WeaponDTO> comparator1 = (a1, a2) ->  Double.compare(a2.getPrice(), a1.getPrice());
		collection
		.stream()
		.sorted(comparator1)
		.forEach(e -> System.out.println(e));
		
		System.out.println("Weapons sort by name and made on in asc order....");
		collection
		.stream()
		.sorted((a1, a2) -> (a1.getName()+a1.getMadeOn()).compareTo(a2.getName()+a2.getMadeOn()))
		.forEach(e -> System.out.println(e.getName()+ "--" + e.getMadeOn()));
		
		System.out.println("Weapons sort by type, made by and name in desc order......");
		collection
		.stream()
		//.sorted((a1, a2) -> a1.getTypee().compareTo(a2.getTypee()))
	.sorted((a1, a2) -> (a1.getMadeBy()+a1.getTypee()+a1.getName()).compareTo(a2.getMadeBy()+a2.getTypee() +a2.getName()))
		.forEach(e -> System.out.println(e.getMadeBy()+ "--" + e.getTypee() + "--" + e.getName()));
	}
	

}
