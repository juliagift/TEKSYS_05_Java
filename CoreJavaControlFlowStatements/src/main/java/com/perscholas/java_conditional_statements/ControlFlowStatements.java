package com.perscholas.java_conditional_statements;

import java.util.Scanner;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		/*
		//Question 1
		//int x =7;  //result- less than 10
		int x = 15;    //console does not display anything
		
		if(x < 10) {
			System.out.println("Less than 10");
		}
		*/
		
		/*
		//Question 2
		
		//int x = 7;  //result-less than 10
		int x = 15;   //result- greater than 10
		
		if(x < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		*/
		
		/*
		//Question 3
		
		//int x = 15;    //result- Between 10 and 20
		int x = 50;      //result- Greater than or equal to 20
		
		if (x < 10) {
			System.out.println("Less than 10");
		} else if (x > 10 && x < 20) {
			System.out.println("Between 10 and 20");
		} else if (x >= 20) {
			System.out.println("Greater than or equal to 20");
		}
		*/
		
		/*
		//Question 4
		
		//int x = 15;    //result: in range
		int x = 5;       //result: out of range
		
		if (x < 10 ||x > 20) {
			System.out.println("Out of range");
		} else if (x >=10 && x <=20) {
			System.out.println("In range");
		}
		*/
		
		/*
		//Question 5
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your score number?");
		
		int numberScore = input.nextInt();
		
		if(numberScore >= 90 && numberScore <= 100) {
			System.out.println("A");
		} else if(numberScore >= 80 && numberScore <= 89) {
			System.out.println("B");
		} else if(numberScore >= 70 && numberScore <= 79) {
			System.out.println('C');
		} else if (numberScore >= 60 && numberScore <=69) {
			System.out.println("D");
		} else if (numberScore < 60) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range");
		}
		*/
		
		//Question 6
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 7");
		
		int num = userInput.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
		}
		

	}

}
