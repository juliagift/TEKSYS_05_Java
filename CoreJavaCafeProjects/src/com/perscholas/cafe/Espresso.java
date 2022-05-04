package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product{
	
	boolean extraShot;
	boolean macchiato;
	
	
	public Espresso() {
		super();
		this.extraShot = false;
		this.macchiato = false;
	}
	
	


	public Espresso(String name, double price, String description) {
		super(name, price, description);
	}




	public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato) {
		super(name, price, description);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	public Espresso(String name, double price, String description, int quantity, boolean extraShot, boolean macchiato) {
		this(name, price, description, extraShot, macchiato);
		setQuantity(quantity);
	}

	
	public boolean hasExtraShot() {
		return extraShot;
	}




	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}




	public boolean hasMacchiato() {
		return macchiato;
	}




	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
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
	public double calculateProductSubtotal() {
		
		double espressoSubtotal = (getQuantity() * getPrice()) + (extraShot ? 2 : 0) + (macchiato ? 1 : 0);
		return espressoSubtotal;
	}




	@Override
	public void addOptions(Scanner scanner) {
		System.out.println("Would you like an extra shot with the espresso (Add $2)? y/n");
		String str = scanner.next();
		
		if(str.equalsIgnoreCase("y")) {
			setExtraShot(true);
		} else if(str.equalsIgnoreCase("n")) {
			setExtraShot(false);
		}
		
		System.out.println("Would you like a macchiato with the espresso (Add $1)? y/n");
		str = scanner.next();

		if(str.equalsIgnoreCase("y")) {
			setMacchiato(true);
		} else if(str.equalsIgnoreCase("n")) {
			setMacchiato (false);
		}
	}
	
	

	@Override
	public void printOptions() {
		System.out.println("Extra Shot: " + (extraShot ? "Yes (Add $2)" : "No") + "   Machiatto: " + (macchiato ? "Yes (Add $1)" : "No"));
		
	}

	public Product duplicateProduct(Product product) {
		Espresso espresso = (Espresso) product;
		Product newProduct = new Espresso(espresso.getName(), espresso.getPrice(), espresso.getDescription(), espresso.getQuantity(), espresso.hasExtraShot(), espresso.hasMacchiato());
		
		return newProduct;
	}

}
