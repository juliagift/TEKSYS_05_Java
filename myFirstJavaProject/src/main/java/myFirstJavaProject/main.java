package myFirstJavaProject;

import java.util.Scanner;

public class main {

	/*starting point
	 * 
	 * slide 11
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {  //static-not attached to an object void-does not return anything 
		
		/*
		
		String name = "Julia";
		
		
		
		//System.out.print("Hello!");   //execute statement
		//System.out.print("Hello! " +name);
		
		
		//priuitive data type
		int number = 120;
		char charValue = 'a';
		byte byteNumber = 41;
		long longNumber = 1232345l;
		boolean truthOrFalse = true; // or false
		
		//wrapper class
		Integer num =203;
		
		//can accept whole numbers and decimals
		double radius;
		double area;
		
		
		//Assign a value
		radius = 20;
		
		//Compute area
		area = radius * radius* 3.14159;
		
		//get the result
		//System.out.println("The radius is " +radius +" and the area is " +area);
		
		
		char a = 'b';                //holds a single character 
		float paycheck = 1234.89f;     
		
		
		int x = 5;
		
		int result = x + 5;
		System.out.println(result);
		
		result = x - 3;
		System.out.println(result);
		
		result = x * 5;
		System.out.println(result);
		
		
		result = x / 5;
		System.out.println("div = " +result);
		
	
		
		result = x % 5;
		System.out.println("mod = " +result);
		
		//math operator
		Math.floor(paycheck);
		Math.abs(paycheck);
		Math.random();
		Math.round(paycheck);
		Math.sqrt(paycheck);
		
		
		// relation operators
		
		System.out.println(7==7);
		System.out.println(7!=7);
		System.out.println(7>=7);
		System.out.println(7<=7);
		
		
		// conditional operators
		
		System.out.println(6>7 && 7>6);  //&& AND: both have to be true
		System.out.println(6>7 || 7>6);  // || OR: only 1 has to be true or false 
		
		*/
		
		//Scanner is a class to help us get user input
		//slides 26-29
		
		//create the scanner using the new keyword
		Scanner userInput = new Scanner(System.in);  //new: used to create a new object
		
		//ask the user what you want them to enter
		System.out.println("Enter your nanme: ");
		
		//store the value in a new variable
		String firstName = userInput.nextLine();
		
		// print out what the user entered
		System.out.println("My name is " +firstName);
		
		//close the scanner
		userInput.close();
		
		
		
		
		
		
		
	}

}
