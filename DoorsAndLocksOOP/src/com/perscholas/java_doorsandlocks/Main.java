package com.perscholas.java_doorsandlocks;



public class Main {

	public static void main(String[] args) {
			
		Warehouse warehouse = new Warehouse(100, 90);
		

		
		System.out.println("Total doors in the warehouse: " +warehouse.countDoor());
		System.out.println("Number of doors with no keys: " +warehouse.countDoor("nokey")[0]);
		
		int[] count = warehouse.countDoor("key");
		System.out.println("Number of doors with keys: " +count[0] + " (square: " + count[1] + ", circular: " + count[2] + ", oval: " + count[3] + ", trapezoiddown: " + count[4] + ")");
		 
	}
}
