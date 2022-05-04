package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee("Coffee", 3.49, "dark", true, false);
		Espresso espresso = new Espresso("Espresso", 3.99, "medium", true, true);
		Cappuccino cappuccino = new Cappuccino("Cappuccino", 4.99, "light", false, false);
		Store store = new Store();
		
		Scanner scanner = new Scanner(System.in);
		
		
/*		
  		Scanner userInput = new Scanner(System.in);
		System.out.println(coffee.getName() + " - " + coffee.getDescription() + " - $" + coffee.getPrice() + " - How many would you like?");
		coffee.setQuantity(userInput.nextInt());
		System.out.println("Product name: " +coffee.getName() +", description: " +coffee.getDescription() + ", product subtotal: $" +coffee.calculateProductSubtotal());
		System.out.println("");
*/
/*	
		System.out.println(espresso.getName() + " - " + espresso.getDescription() + " - $" + espresso.getPrice() + " - How many would you like?");
		espresso.setQuantity(userInput.nextInt());
		System.out.println("Product name: " +espresso.getName() +", description: " +espresso.getDescription() + ", product subtotal: $" +espresso.calculateProductSubtotal());
		System.out.println("");
		
		System.out.println(cappuccino.getName() + " - " + cappuccino.getDescription() + " - $" + cappuccino.getPrice() + " - How many would you like?");
		cappuccino.setQuantity(userInput.nextInt());
		System.out.println("Product name: " +cappuccino.getName() +", description: " +cappuccino.getDescription() + ", product subtotal: $" +cappuccino.calculateProductSubtotal());
		System.out.println("");
		
		double salesSubtotal = coffee.calculateProductSubtotal() + espresso.calculateProductSubtotal() +cappuccino.calculateProductSubtotal();
		double salesTotal = salesSubtotal + Product.SALES_TAX;
		System.out.println("Sales subtotal: $" +salesSubtotal +", sales tax: $" +Product.SALES_TAX +", sales total: $" +salesTotal);
		
		espresso.addOptions();
		espresso.printOptions();
*/		
		store.openStore();
		store.displayMainMenu(scanner);
		
		scanner.close();
		
	}

}
