package com.perscholas.java_arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		String[] myStr = new String[10];
		String[] myStr2 = {"Julia", "hello"};
		
		myStr[0] = "Julia";
		myStr[1] = "hello";
		myStr[2] = myStr[0] +" " +myStr[1];
		
		//System.out.println(myStr[2]);
		//System.out.println(myStr2[0] +" " +myStr2[1]);
		
		int[] myInt = new int[10];
		for(int i = 1; i < 10; i++) {
			//myInt[i] = i + myInt[i-1];
			//System.out.println(myInt[i]);
		}
		//System.out.println(myInt.length);
		
		
		for(int i = 0; i < myInt.length; i++) {
			//System.out.println(i);              //prints the index
			//System.out.println(myInt[i]);       //prints the value of the index
		}
		
		//enhanced for loop
		
		for(int i:myInt) {
			//System.out.println(i);  //prints the value of the index
		}
		
		myInt[0] = 234;
		
		int[] copyOfArr = myInt.clone();
		
		//System.out.println(Arrays.toString(copyOfArr));
		//System.out.println(Arrays.toString(myInt));
		
		
		//Initializing Arrays
		
//		int n;
//		
//	       
//		Scanner userInput = new Scanner(System.in);
//		
//	    System.out.print("Enter the number of elements you want to store: ");
//	    
//	    //reading the number of elements from the that we want to enter
//	    n = userInput.nextInt();
//	    
//	    //creates an array in the memory of length 10
//	    int[] arr = new int[n];
//	    
//	    System.out.println("Enter the elements of the array: ");
//	    
//	    for(int i = 0; i < n; i++) {
//	    	//reading array elements from the user  
//	        arr[i] = userInput.nextInt();
//	    }
	
//	    System.out.println("Array elements are: ");
//	     // accessing array elements using the for loop
//	    for (int i=0; i < n; i++){
//	    	System.out.println(arr[i]);
//	    }
	    
//	    userInput.close();
	    
	    double[] arr = new double[5];
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = Math.floor(Math.random() * 10);
		}
	    //System.out.println("Random number " +Arrays.toString(arr));
	    
	    
	    
	    
	    int[] numbers = {3, 4, 5, -5, 0, 12};
	    
	    //creating a variable to store the sum of the array

		int sum = 0;
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//			//sum = sum + numbers[i];
//			sum+=numbers[i];
//		}
//		
//		System.out.println(sum);
		
		
		for(int number : numbers) {
			sum =+ number;
		}
		
		//System.out.println(sum);
		
		double max = numbers[0];
		int maxIdx = 0;
				
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIdx = i;
			}
		}
		System.out.println(max);
		System.out.println(maxIdx);
		
		//Reversing an array
		
		Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		 //-----print array starting from first element---------
		    System.out.println("Original Array:");
		    
		    for(int i=0;i<intArray.length;i++)
		         System.out.print(intArray[i] + "  ");
		    System.out.println();
		     
		  //----------print array starting from last element----
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=intArray.length-1;i>=0;i--) {
		              System.out.print(intArray[i] + "  "); 
		          }

		
	}

}
