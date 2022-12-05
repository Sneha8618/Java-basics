package com.xworkz.interview;

public class PatternProgram {
	
	public static void main(String args[]) {
		
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(" " +j);
			}
			System.out.println();
			
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col= 1; col <= 5; col++) {
				if(row == 2 && col == 4) {
				System.out.print("xworkz");
			}
				else {
					System.out.print(" " +col);
				}
			
		}
			System.out.println();
	}
		
		System.out.println("------------------------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == 5 && j == 1) {
					System.out.print("Sneha");
				}
				else {
					System.out.print(" " +j);
				}
				
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == 2 && j == 2 || i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 3) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j == 1 || j == 4 || i == 1 || i == 4) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i == 2 && j == 3 || i == 3 && j == 2 || i == 3 && j == 4 || i == 4 && j == 3) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(row == 1 || col == 1 || row == 2 && col == 2 || row == 3 && col == 3 || row == 4 && col == 4 || row ==5 && col == 5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(row == 5 || col == 5 || row == 4 && col == 4 || row == 3 && col == 3 || row == 2 && col ==2 || row == 1 && col == 1) {
					System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(row == 1 || row == 3 || row == 5 || row == 2 && col == 1 || row == 4 && col == 5) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 9; col++) {
				if(row == 1 && col == 1 || row == 2 && col == 2 || row == 3 && col == 3 || row == 4 && col == 4 || row == 5 && col == 5 || row == 4 && col == 6 || row == 3 && col == 7 || row == 2 && col == 8 || row == 1 && col == 9) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 6; col++) {
				if(col == 1 || col ==6 || row == 2 && col == 2 || row == 3 && col == 3 || row == 4 && col == 4) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row ++) {
			for(int col = 1; col <= 5; col++) {
				if(col == 1 || col == 5 || row == 2 && col == 2 || row == 3 && col == 3 || row == 2 && col == 4) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(col == 1 || row == 1 && col == 2 || row == 1 && col == 3 || row == 2 && col == 5 || row == 3 && col == 5 || row == 4 && col == 5 || row == 5 && col == 3 || row == 5 && col == 2) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5 ; row++) {
			for(int col = 1; col <= 5; col++) {
				if(col == 1 || row == 1 && col == 2 || row == 1 && col == 3 || row == 1 && col == 4 || row == 2 && col == 5 || row == 3 && col == 5 || row == 3 && col == 4 || row == 3 && col == 3 || row == 3 && col == 2) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(col == 1 || col == 5 || row == 1 || row == 5) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if( row == 1 || row == 5 || row == 2 && col == 4 || row == 3 && col == 3 || row == 4 && col == 2) {
					System.out.print("@");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		for(int row = 1; row <= 5; row++) {
			for(int col = 1; col <= 5; col++) {
				if(col % 2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
		
	   }
			
	
		
		
 }


