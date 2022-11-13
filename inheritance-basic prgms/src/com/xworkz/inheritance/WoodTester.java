package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Table;
import com.xworkz.inheritance.fruit.Wood;

public class WoodTester {
	
  public static void main(String args[]) {
		
		Wood wd = new Wood();
		wd.toBuild();
			
		Table wd1 = new Table();
		wd1.toMakeFurnitures("Shreegandha Wood");
		System.out.println("Table is made up of " + wd1.type);
				
		
	}


}
