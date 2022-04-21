package com.perscholas.java_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// Question 1
		int[] arr = new int [3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		//Question 2
		int[] arr = {13, 5, 7, 68, 2};
		
		if (arr.length == 0) {
			System.out.println("array has no values");
		} else if (arr.length % 2 == 1) {
			System.out.println(arr[arr.length/2]);
		} else if (arr.length % 2 == 0) {
			System.out.println(arr[arr.length/2 -1] +" " +arr[arr.length/2]);
		} 
		
		
		
		
		
		//Question 3
		String[] arr = new String[]{"red", "green", "blue", "yellow"};
		System.out.println(arr.length);
		
		String[] copy = arr.clone();
		System.out.println(Arrays.toString(copy));
		
		
		//Question 4
		
		int[] arr = new int[] {3, 8, 10, 15, 18};
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
		
		System.out.println(arr[arr.length]);  //ArrayIndexOutOfBoundsException
		
		arr[5] = 23;
		System.out.println(arr[5]);   //ArrayIndexOutOfBoundsExceptiion
		
		
		//Question 5
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = i;
		}
		
		
		
		
		//Question 6
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 2 * i;
					
		}
		
		
		//Question 7
		int[] arr = new int[] {5, 9, 3, 8, 1};
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length/2) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		//Question 8
		int[] arr = new int[] {16, 45, 33, 76, 87};
		
		int temp = arr[0];
		arr[0] = arr[arr.length/2];
		arr[arr.length/2] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//Question 9
		int[] arr = {4, 2, 9, 13, 1, 0};
		
		Arrays.sort(arr);
		
		
		
		System.out.println("Array in ascending order: " +Arrays.toString(arr));
		System.out.println("The smallest number is " +arr[0]);
		System.out.println("The biggest number is " +arr[arr.length - 1]);
		
		//Question 10
		
		String[] strArr = {"49", "dog", "cat", "fish", "1.25"};
		System.out.println(Arrays.toString(strArr));
		
	}

}
