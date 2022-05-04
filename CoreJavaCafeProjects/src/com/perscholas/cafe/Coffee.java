package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product{
	
	boolean sugar;
	boolean milk;
	
	
	
	public Coffee() {
		super();
		this.milk = false;
		this.sugar = false;
	}
	
	



	public Coffee(String name, double price, String description) {
		super(name, price, description);
	}





	public Coffee(String name, double price, String description, boolean sugar, boolean milk) {
		super(name, price, description);
		this.milk = sugar;
		this.sugar = milk;
	}
	
	public Coffee(String name, double price, String description, int quantity, boolean sugar, boolean milk) {
		this(name, price, description, sugar, milk);
		setQuantity(quantity);
	}
	






	public boolean hasSugar() {
		return sugar;
	}





	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}





	public boolean hasMilk() {
		return milk;
	}





	public void setMilk(boolean milk) {
		this.milk = milk;
	}



	@Override
	public double calculateProductSubtotal() {
		
		double coffeeSubtotal = getQuantity() * getPrice();
		return coffeeSubtotal;
	}





	@Override
	
		
	public void addOptions(Scanner scanner) {
		
		System.out.println("Would you like sugar with the coffee? y/n");
		String str = scanner.next();
		
		if(str.equalsIgnoreCase("y")) {
			setSugar(true);
		} else if(str.equalsIgnoreCase("n")) {
			setSugar(false);
		}
		
		System.out.println("Would you like a milk with the coffee? y/n");
		str = scanner.next();

		if(str.equalsIgnoreCase("y")) {
			setMilk(true);
		} else if(str.equalsIgnoreCase("n")) {
			setMilk (false);
		}
	}
	

	
	public void takeOrder(Scanner scanner) {
		
		System.out.println(getName() + " - " + getDescription() + " - $" + getPrice() + " - How many would you like?");
		setQuantity(scanner.nextInt());
		System.out.println("Product name: " +getName() +", description: " +getDescription() + ", product subtotal: $" +calculateProductSubtotal());
		System.out.println("");
		
		addOptions(scanner);
		
		System.out.println(getName() + " added to your cart!");
		System.out.println();
	}


	@Override
	public void printOptions() {
		System.out.println("Sugar: " + (sugar ? "Yes" : "No") + "   Milk: " + (milk ? "Yes" : "No"));
		
	}

	public Product duplicateProduct(Product product) {
		Coffee coffee = (Coffee) product;
		Product newProduct = new Coffee(coffee.getName(), coffee.getPrice(), coffee.getDescription(), coffee.getQuantity(), coffee.hasSugar(), coffee.hasMilk());
		
		return newProduct;
	}

}
