package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		
		/*Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. 
		Assign the sum to a variable. Print out the result.*/
		
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println("The sum of " +a +" and " +b +" is " +c +".");
		
		/*Write a program that declares 2 double variables, assigns a number to each, and adds them together. 
		Assign the sum to a variable. Print out the result.*/
		
		double d = 1.001;
		double e = 5.35;
		double f = d + e;
		System.out.println("The sum of " +d +" and " +e +" is " +f +".");
		
		
		/*Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
		Assign the sum to a variable. Print out the result. What variable type must the sum be?*/
		
		int g = 14;
		double h = 3.504;
		double i = g + h;
		System.out.println("The sum of " +g +" and " +h +" is " +i +"."); //The variable type of the sum  must be a double.
		
		
		/*Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number 
		by the smaller number. Assign the result to a variable. Print out the result. Now change the larger number to a decimal. 
		What happens? What corrections are needed?*/
		
		int j = 100;
		int k = 25;
		int l = j/k;
		System.out.println("The result is " +l +".");
		
		/*An error occurs. A floating-point value cannot be assigned to an int. The data type for variables j and l should be changed 
		to a floating-point literal s(double) as shown
		
		double j = 100.01;
		int k = 25;
		double l = j/k;
		
		*/
		
		/*Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. 
		Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.*/
		
		double m = 94.39409;
		double n = 23.456;
		double o = m/n;
		System.out.println("The result is " +o +".");
		
		int p = (int) o;
		System.out.println("The result is " +p +".");
		 
		/*Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y. Declare a variable q and 
		assign y/x to it and print q. Now, cast y to a double and assign to q. Print q again.*/
		
		int x = 5;
		int y = 6;
		double q = y/x;
		System.out.println("q = " +q);
		
		q = (double) y;
		System.out.println("q = " +q);
		
		
		/*Write a program that declares a named constant and uses it in a calculation. Print the result.*/
		
		final double PI = 3.14159;
		final int RADIUS = 10;
		final double AREA = PI * RADIUS * RADIUS;
		System.out.println("The area of the circle is " +AREA);
		
		
		//Write a program where you create 3 variables that represent products at a cafe.
		
		double coffee = 2.5;
		double chai= 4.99;
		double espresso = 3.5;
		double subtotal;
		double totalSale;
		
		subtotal = 3*coffee + 4*chai + 2*espresso;
		final double SALES_TAX = 0.78;
		
		totalSale = subtotal + SALES_TAX;
		
		System.out.println("Total sale = $" +String.format("%.2f", totalSale));
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		  
		   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
