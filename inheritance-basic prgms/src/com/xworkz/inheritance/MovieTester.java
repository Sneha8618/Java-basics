package com.xworkz.inheritance;

import com.xworkz.inheritance.fruit.Movie;

public class MovieTester {
	
public static void main(String args[]) {
		
        Movie mv = new Movie();
		mv.toWatch("KGF");
		System.out.println(" One of the Fan india movie is "  + mv.movieName);
	}

}
