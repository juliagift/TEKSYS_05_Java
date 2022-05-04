package com.perscholas.java_fileioproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Java files/IO Slides 7, 30, 36, 37, 53
		
		
		
		//Byte Streams from slide 30
		
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		
//		try {
//			in = new FileInputStream("input.txt");
//			
//			out =new FileOutputStream("output.txt");
//			
//			int num;
//			
//			while((num = in.read()) != -1) {
//				out.write(num);
//				}
//		}finally {
//			if(in != null) {
//				in.close();
//				System.out.println("ran in");
//			}
//			if(out != null) {
//				out.close();
//				System.out.println("ran out");
//			}
//		}
		
//		InputStreamReader streamIn = null;
//		
//		
//		try {
//			streamIn = new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit");
//			
//			char Q;
//			do {
//				Q = (char)streamIn.read();  //convert from number to char
//				System.out.println(Q);
//			} while(Q != 'Q');
//		} finally {
//			
//			if(streamIn != null) {
//				streamIn.close();
//			}
//		}
		
		
		//Character Streams
		
//		FileReader in = null;
//		FileWriter out = null;
//		
//		try {
//			in = new FileReader("input.txt");
//			
//			out = new FileWriter("output.txt");
//			
//			int num;
//			
//			while((num = in.read()) != -1) {
//				out.write(num);
//				}
//		}finally {
//			if(in != null) {
//				in.close();
//				System.out.println("ran in");
//			}
//			if(out != null) {
//				out.close();
//				System.out.println("ran out");
//			}
//		}
		
		
		//Standard Streams

		//Reading and Writing files
		
		//created a CSV file
		String path = "newfile.csv";
		
		//try to run this code first
//		try {
//			//created a file obj
//			File file = new File(path);
//			//scanner to read this and print it out in the console
//			Scanner input = new Scanner(file);
//			//ArrayList using the obj of Course
//			ArrayList<Course> data = new ArrayList<>();
//			
//			//
//			while(input.hasNextLine()) {
//				String[] line = input.nextLine().split(",");  //read a file through a loop
//				data.add(new Course(line[0], line[1], line[2]));
//			}
//			
//			for (Course c : data) {
//				System.out.format("%-15s | %-35s | %-25s\n", c.getCode(), c.getName(), c.getInstructor());
//			}
//			
//			//String inputLine = input.nextLine();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("No file here");
//			e.printStackTrace();
//		}
//		
//		System.out.println(file.isDirectory());
		
		//return an array of files
//		File[] fileWithPath = file.listFiles();
		
		try {
			
			//bufferedreader is calling input stream
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("What is your name?");
			//storing name
			String name = reader.readLine();
			
			System.out.println("What is your job?");
			String job = reader.readLine();
			
			System.out.format("%s, %s", name, job);
			reader.close();
		} catch(IOException ioe) {
			System.out.println("IO in BufferedReader in main");
			ioe.printStackTrace();
		}
		
		


	}

}
