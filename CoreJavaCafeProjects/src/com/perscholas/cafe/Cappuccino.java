package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product{
	
	boolean peppermint;
	boolean whippedCream;
	
	
	
	public Cappuccino() {
		super();
		this.peppermint = false;
		this.whippedCream = false;
	}
	
	
	
	public Cappuccino(String name, double price, String description) {
		super(name, price, description);
	}



	public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream) {
		super(name, price, description);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}

	public Cappuccino(String name, double price, String description, int quantity, boolean peppermint, boolean whippedCream) {
		this(name, price, description, peppermint, whippedCream);
		setQuantity(quantity);
	}

	

	public boolean hasPeppermint() {
		return peppermint;
	}


	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}


	public boolean hasWhippedCream() {
		return whippedCream;
	}


	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}


	@Override
	public double calculateProductSubtotal() {
		
		double cappuccinoSubtotal = (getQuantity() * getPrice()) + (peppermint ? 2 : 0) + (whippedCream ? 1 : 0);
		return cappuccinoSubtotal;
	}
	
	public void takeOrder(Scanner scanner) {
		
		System.out.println(getName() + " - " + getDescription() + " - $" + getPrice() + " - How many would you like?");
		setQuantity(scanner.nextInt());
		System.out.println("Product name: " +getName() +", description: " +getDescription() + ", product subtotal: $" +calculateProductSubtotal());
		System.out.println();
		
		addOptions(scanner);
		
		System.out.println(getName() + " added to your cart!");
		System.out.println();
	}


	@Override
	public void addOptions(Scanner scanner) {
		
		System.out.println("Would you like peppermint with the cappuccino (Add $2)? y/n");
		String str = scanner.next();
		
		if(str.equalsIgnoreCase("y")) {
			setPeppermint(true);
		} else if(str.equalsIgnoreCase("n")) {
			setPeppermint(false);
		}
		
		System.out.println("Would you like whipped cream with the cappuccino (Add $1)? y/n");
		str = scanner.next();

		if(str.equalsIgnoreCase("y")) {
			setWhippedCream(true);
		} else if(str.equalsIgnoreCase("n")) {
			setWhippedCream(false);
		}
		
	}


	@Override
	public void printOptions() {
		System.out.println("Peppermint: " + (peppermint ? "Yes (Add $2)" : "No") + "   Whipped Cream: " + (whippedCream ? "Yes (Add $1)" : "No"));
		
	}
	
	public Product duplicateProduct(Product product) {
		Cappuccino cappuccino = (Cappuccino) product;
		Product newProduct = new Cappuccino(cappuccino.getName(), cappuccino.getPrice(), cappuccino.getDescription(), cappuccino.getQuantity(), cappuccino.hasPeppermint(), cappuccino.hasWhippedCream());
		
		return newProduct;
	}

}
