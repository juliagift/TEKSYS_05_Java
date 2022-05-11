package com.perscholas.java_practice;

import java.io.File;
import java.util.StringJoiner;

public class Main {
	
	public static void main(String[] args) {
		
//		StringBuffer str = new StringBuffer("PerScholas");
//		
//		
//		System.out.println(str.length());  //10
//		System.out.println(str.capacity()); //26
//		System.out.println(str.append(" Platform")); //PerScholas Platform
//		System.out.println(str.append(1));  //PerScholas Platform1
//		System.out.println(str.insert(5, "for"));  //PerScforholas Platform1
//		System.out.println(str.insert(0, 5));  //5PerScforholas Platform1
//		System.out.println(str.insert(3, true));  //5PetruerScforholas Platform1
//		
//		char[] geeks_arr = {'b', 'y'};
//		str.insert(2, geeks_arr);
//		System.out.println(str); //5PbyetruerScforholas Platform1
//		
//		System.out.println(str.reverse());  //1mroftalP salohrofcSreurteybP5
//		System.out.println(str.reverse());  //5PbyetruerScforholas Platform1
//		
//		System.out.println(str.replace(3, 6, "Julia"));  //5PbJuliaruerScforholas Platform1
//		System.out.println(str.replace(0, 4, "Gift"));  //GiftuliaruerScforholas Platform1
//		
//		System.out.println(str.delete(4, 7));  //GiftaruerScforholas Platform1
//		System.out.println(str.deleteCharAt(5)); //GiftauerScforholas Platform1
//		
//		System.out.println(str.toString()); //GiftauerScforholas Platform1
//		
//		
//		System.out.println("");
//		
//		StringJoiner joinNames = new StringJoiner(",", "{", "}");
//		joinNames.add("Rahul");
//		joinNames.add("Raju");
//		
//		System.out.println(joinNames);  //[Rahul,Raju]
//		System.out.println(joinNames.toString());
//		
//		StringJoiner joinNames2 = new StringJoiner(":", "[", "]");
//		joinNames2.add("Peter");
//		joinNames2.add("Raheem");
//		
//		System.out.println(joinNames2); //[Peter:Raheem]
//		
//		StringJoiner merge = joinNames.merge(joinNames2);
//		System.out.println(merge);  //{Rahul,Raju,Peter:Raheem}
//		
//		
//		System.out.println("");
//		
//		File f1 = new File("..");
//		System.out.println(f1.isAbsolute());  //false
//		
//		File f2 = new File("c:\\temp");
//		System.out.println(f2.isAbsolute());  //true
//		
//		
//		System.out.println("");
//		
//		System.out.println("ABC\r\nDEF");
//		System.out.println("ABC\rDEF");
//		System.out.println("ABC\nDEF");
		
		String name = "Name";
		String desc = "Description";
		Double price = 12.34889045;
		Integer availQuant = 3;
		
		
		
		System.out.println("AppSystem Inventory:");
    	System.out.format("%-20s %-20s %-10s %-10s\n", "Name", "Description", "Price", "Available Quantity");

        System.out.format("%-20s %-20s %-10.2f %-10d\n", name, desc, price, availQuant);


		
	}

}
