package com.perscholas.java_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
	//Exceptions
	public static void main(String[] args) {
		//Checked Exception
		//FileNotFoundException
	
		File myFile = new File("text.txt");
		try {
		FileReader fr = new FileReader(myFile);
		
		int[] num = {1, 2, 3, 4};
		System.out.println(num[2]);
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch  (ArrayIndexOutOfBoundsException ea) {
			ea.printStackTrace();
		} finally {
			System.out.println("Everything is working");
		}
		
	}
		
		//runtime exceptions occur at execution
		//ArrayIndexOutOfBoundsException
//		int[] num = {1, 2, 3, 4};
//		System.out.println(num[7]);
		
		
		
		public static void withdraw(double amount) throws CustomException {
			
			double balance = 0;
			if(amount <= balance ) {
				balance -= amount;
			} else {
			double accountBelow = amount - balance;
			throw new CustomException(accountBelow);
			
			
			}

	}

}
