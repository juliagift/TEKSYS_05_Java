package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
	
	List<Product> products = new ArrayList<>();
	Coffee coffee;
	Cappuccino cappuccino;
	Espresso espresso; 
	ShoppingCart shoppingCart;
	
	public Store() {
		
	}
	
	
	public Store(List<Product> products, Coffee coffee, Cappuccino cappuccino, Espresso espresso,
			ShoppingCart shoppingCart) {
		super();
		this.products = products;
		this.coffee = coffee;
		this.cappuccino = cappuccino;
		this.espresso = espresso;
		this.shoppingCart = shoppingCart;
	}
	
	
	public void openStore() {   
		coffee = new Coffee("Coffee", 3.49, "dark");
		espresso = new Espresso("Espresso", 3.99, "medium");
		cappuccino = new Cappuccino("Cappuccino", 4.99, "light");
		shoppingCart = new ShoppingCart();
		
		products.add(coffee);
		products.add(cappuccino);
		products.add(espresso);
	}
	
	




	public void displayMainMenu(Scanner scanner) {
		int mainMenuChoice;
		
		
		do {
			
			System.out.println("Please select from the following menu: ");
			
			
			
			for(int i = 0; i < products.size(); i++) {
				System.out.print(i+1 +": ");
				System.out.println(products.get(i).getName());
			}
			System.out.println((products.size()+1) +": Check Out");
			
			
			mainMenuChoice = scanner.nextInt();
			mainMenuChoice--;
			
			
			if(mainMenuChoice == products.size()) {
				displayCheckoutMenu();
			} else if (mainMenuChoice == 99) { // debug branch to display the Store instance variables.
				displayProducts();
			} else {
				Product product = products.get(mainMenuChoice);
				product.takeOrder(scanner);
				shoppingCart.addProduct(product.duplicateProduct(product));
			}
			
			

		} while(mainMenuChoice != products.size());
		
		System.out.println();
		System.out.println("Thank you for shopping at J-Mart!");
	}
	
	public void displayCheckoutMenu() {
		System.out.println("Proceed to checkout.");
		// Proceed to checkout.
		shoppingCart.printShoppingCart();
	
	}                  
	
	public void displayProducts() {
		
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getName());
			System.out.println(products.get(i).getPrice());
			System.out.println(products.get(i).getDescription());
			System.out.println(products.get(i).getQuantity());
			products.get(i).printOptions();
		}
	}

}
