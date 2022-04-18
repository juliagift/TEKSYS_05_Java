package com.perscholas.java_operators_numbers;

public class OperatorsAndNumbers {

	public static void main(String[] args) {
		/*
		 * Question 1
		 * 
		 * Convert integers to binary notation
		1: 1
		8: 1 000
		33: 10 0001
		78: 100 1110
		787: 11 0001 0011
		  
		  Question 2
		  
		Convert binary numbers to decimal notation
		0010: 2
		1001: 9
		0011 0100: 52
		0111 0010: 114
		0010 0001 1111: 543
		0010 1100 0110 0111: 22631
		*/
		
		/*
		 * Question 3
		 * 
		int x = 2;
		String res1 = Integer.toBinaryString(x);
		System.out.println(res1);
		
		x = x << 1;
		//predicted decimal value: 4
		//predicted binary string: 100
		System.out.println("Binary notation of x: "+Integer.toBinaryString(x) +", " +"Decimal form of x: " +x);
		
		int y = 9;
		String res2 = Integer.toBinaryString(y);
		System.out.println(res2);
		
		y = y << 1;
		//predicted decimal value: 18
		//predicted binary string: 1 0010
		System.out.println("Binary notation of y: "+Integer.toBinaryString(y) +", " +"Decimal form of y: " +y);
		
		int z = 17;
		String res3 = Integer.toBinaryString(z);
		System.out.println(res3);
		
		z = z << 1;
		//predicted decimal value: 34
		//predicted binary string: 10 0010
		System.out.println("Binary notation of z: "+Integer.toBinaryString(z) +", " +"Decimal form of z: " +z);


		int zz = 88;
		String res4 = Integer.toBinaryString(zz);
		System.out.println(res4);
		
		zz = zz << 1;
		//predicted decimal value: 176
		//predicted binary string: 1011 0000
		System.out.println("Binary notation of zz: "+Integer.toBinaryString(zz) +", " +"Decimal form of zz: " +zz);
		
		*/
		
		
		/*Question 4
		
		int x = 150;
		String res1 = Integer.toBinaryString(x);
		System.out.println(res1);
		
		x = x >> 2;
		//predicted decimal value: 37
		//predicted binary string: 10 0101
		System.out.println("Binary notation of x: "+Integer.toBinaryString(x) +", " +"Decimal form of x: " +x);
		
		int y = 225;
		String res2 = Integer.toBinaryString(y);
		System.out.println(res2);
		
		y = y >> 2;
		//predicted decimal value: 56
		//predicted binary string: 11 1000
		System.out.println("Binary notation of y: "+Integer.toBinaryString(y) +", " +"Decimal form of y: " +y);
		
		int z = 1555;
		String res3 = Integer.toBinaryString(z);
		System.out.println(res3);
		
		z = z >> 2;
		//predicted decimal value: 388
		//predicted binary string: 1 1000 0100
		System.out.println("Binary notation of z: "+Integer.toBinaryString(z) +", " +"Decimal form of z: " +z);


		int zz = 32456;
		String res4 = Integer.toBinaryString(zz);
		System.out.println(res4);
		
		zz = zz >> 2;
		//predicted decimal value: 8114
		//predicted binary string: 1 1111 1011 0010
		System.out.println("Binary notation of zz: "+Integer.toBinaryString(zz) +", " +"Decimal form of zz: " +zz);
		*/
		
		/*Question 5
		
		int x = 7;
		int y = 17;
		int z;
		
		//predicted bitwise & on x and y: binary value- 1, decimal value- 1
		
		z = x & y;
		System.out.println(z);
		
		//predicted bitwise or on x and y: binary value- 1 0111, decimal value- 23
		System.out.println(x | y);
		
		 */
		
		/*Question 6
		int a = 10;
		
		System.out.println("Value before increment = "  +a++ +", " +"value after increment = " +a);
		*/
		
		/*Question 7
		
		int b = 1;
		System.out.println(b);
		
		b++;
		System.out.println(b++);
		
		System.out.println(b);
		*/
		
		/*Question 8
		
		int x = 5;
		int y = 8;
		//int sum = ++x + y          //sum = 14
		int sum = x++ + y;           //sum = 13
		
		System.out.println(sum);
		
		*/
		
	}

}
