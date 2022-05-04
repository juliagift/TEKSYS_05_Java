package com.perscholas.java_list_arraylist;

import java.time.DayOfWeek;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.EnumMap;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;

import java.util.*;

public class ListAndArrayList {

	public static void main(String[] args) {
		
//		List<Integer> myNumberList;
//		Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

		
		
		
		
//		System.out.println(myList.size());  //100
//		System.out.println(myList.indexOf(50));  //50
//		System.out.println(myList.contains(80));  //true
//		System.out.println(myList.contains(180)); //false
//		
//		boolean success = myList.remove((Integer)80);
//		System.out.println(success);      //true
//		
//		success = myList.remove((Integer)80);
//		System.out.println(success);    //false
//		
//		System.out.println(myList.indexOf(80));   //-1
		
		LinkedList<Integer> linkOne = new LinkedList<Integer>();
		linkOne.add(23);
		linkOne.add(12);   //append at the end
		linkOne.add(2, 56);
//		linkOne.get(1);
		linkOne.set(0, 98); //set allows to edit a particular index
//		linkOne.indexOf(12);
//		linkOne.remove(1);
//		linkOne.size();
		System.out.println(linkOne.remove((Integer)12));
		
		
//		Map slide 48
		//key, value pairs
//		EnumMap<DayOfWeek, Integer> map = new EnumMap<>(DayOfWeek.class);
//		map.put(DayOfWeek.FRIDAY, 23);
//		
//		HashMap<Integer, String> cars = new HashMap<>();
//		
//		cars.containsValue(cars);
//		cars.containsKey(cars);
		
//		HashSet<String> setHashList = new HashSet<>();
//		
//		setHashList.add("one");
//		setHashList.add("TWO");
//		setHashList.add("Julia");
//		setHashList.add("Sara");
//		setHashList.add("Two");
//		
//		Iterator<String> itr = setHashList.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next()); //next return the current item, then updates the pointer
//
//		}
//		
//		// Creating a List
//        List<String> al = new ArrayList<>();
// 
//        // Adding elements in the List
//        al.add("mango");
//        al.add("orange");
//        al.add("Grapes");
// 
//        // Iterating the List
//        // element using for-each loop
//        for (String fruit : al)
//            System.out.println(fruit);
//        
//        System.out.println(al);

	}

}
