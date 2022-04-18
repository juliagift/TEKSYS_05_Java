package com.company;

import java.util.Scanner;

public class LoopsIfStatements {

	public static void main(String[] args) {
		
		/*
		Scanner userInput = new Scanner(System.in);
		
		int num = 10;
		int otherNum = 7;
		
		//popular with boolean syntax
		boolean isEven = num % 2 == 0;
		
		//if statement
		if (otherNum < num) {
			System.out.println("yes");
		}
		
		if (isEven) {
			System.out.println("even");
		}
		
		
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("even");
		}
		
		//if & else
		int age = 17;
		
		if (age < 18) {
			System.out.println("Can't buy this game");
		} else {
			System.out.println("You can buy this game");
		}
		
		if (age > 15 || age < 18) {
			System.out.println("Can buy this game");
		} else if (age > 18 && age < 25) {
			System.out.println("in range over the age of 18");
		}
		else {
			System.out.println("not in range");
		}
		
		System.out.println("Hi, what i your name?");
		
		String firstName = userInput.nextLine();
		
		System.out.println("What is your age?");
	
		int userAge = userInput.nextInt();
		
		if (userAge > 17) {
			System.out.println(firstName +", you may pass.");
		} else {
			System.out.println("Sorry, " +firstName +", you are not old enough.");
		}
		
		
		userInput.close();
		
		*/
		
		/*
		
		int day = 2;
		
		switch(day) {
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tues");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		default:
			System.out.println("I'm on a break");
			
		}
		
		//ternary operator
		
		//(run expression) ? "yes" : "no";
		
		boolean exp =(3 == 10) ? true : false;
		
		System.out.println(exp);
		
		*/
		
		/*
		
		// loops
		
		// while loop- runs if the condition is true
		 * 
		 //can be used for timers
		
		boolean flag = true;
		int count = 0;
		
		while(count < 20) {
			System.out.println(count +" Welcome");
			
			count++;
		}
		
		*/
		
		/*
		
		//do-while loops
		
		
		int count = 0;
		
		//this loop will run once before it checks the condition
		
		do {
			System.out.println(count);
			count++;
		} while (count < 15);
		
		*/
		
		// for loop
		
		// for ( initialize action; condition; after iteration)
		// for (start variable; condition to be met; add one to the iteration)
		
//		for(int count = 0; count < 10; count++) {
//			System.out.println(count+ " count");
//		}
		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(i+ " count");
//		}
//		
//		//int i = 10; j = 0, k = 36;
//		
//		for(int i = 0, j = 0; (i + j < 10); i++, j++ ) {
//			System.out.println(i + j);
//		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("count "+i);
			for (int j = 1; j <=5; j++) {
				System.out.println(j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
