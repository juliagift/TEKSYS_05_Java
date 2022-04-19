package com.perscholas.java_loops;

public class Loops {

	public static void main(String[] args) {
		
		
		// Question 1
		
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		
		
		//Question 2
		
		int num = 0;
		
		while(num <= 100) {
			System.out.println(num);
			num++;
		}
		
		
		
		//Question 3
		
		int numb = 1;
		
		do {
			System.out.println(numb);
			numb++;
		} while (numb < 11);
		
		
		//Question 4
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				if (i > 25 && i < 75) {
					continue;
				}
				System.out.println(i);
			}
		}
		
		
		
		//Question 5
		
		for (int i = 1; i <= 100; i++) {
			if ( i % 5 == 0) {
				if (i > 50) {
					break;
				}
				System.out.println(i);
			}
		}
		
		
		
		//Question 6
		for (int i = 1; i < 3; i++) {
			System.out.println("Week " +i +":");
			for (int j = 1; j < 6; j++) {
				System.out.println("Day " +j);
			}
		}
		
		
		//Question 7
		
		
		
		for (int i = 10; i < 200; i++) {
			String str = String.valueOf(i);
			
			for (int j = 0; j < str.length()/2; j++) {
				if (str.charAt(j) == str.charAt(str.length() -1 -j)) {
					System.out.println(i);
				}
			}
		}
		
		
		
		//Question 8
		
		int firstNum = 0;
		int secondNum = firstNum + 1; 
		int thirdNum = firstNum + secondNum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		while (thirdNum < 50) {
			System.out.println(thirdNum);
			
			firstNum = secondNum;
			secondNum = thirdNum;
			thirdNum = firstNum + secondNum;
		}
		
		
		
		//Question 9
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Inner loop:i: " +i +", j: " +j);
			}
		}
		
		
		
		

	}

}
