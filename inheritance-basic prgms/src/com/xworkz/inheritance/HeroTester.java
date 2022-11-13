package com.xworkz.inheritance;

import com.xworkz.inheritance.apple.Appu;
import com.xworkz.inheritance.fruit.Hero;

public class HeroTester {

	public static void main(String args[]) {
		
		Hero hr = new Hero();
		hr.toMakeFilms("Jaanu");
		System.out.println("Most famous heros film name is" + hr.filmName);
		
		Appu hr1 = new Appu();
		hr1.toMakeFilms("Milana");
		System.out.println("Appus famous film is" + hr1.filmName);
	}
}
