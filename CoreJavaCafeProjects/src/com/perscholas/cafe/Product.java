package com.perscholas.cafe;

import java.util.Scanner;

public abstract class Product {
	
	private String name;
	private double price;
	private String description;
	private int quantity;
	final static double SALES_TAX = 0.078;
	
	public Product() {
		
	}

	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public abstract double calculateProductSubtotal();
	
	
	public double calculateProductTotal() {
		 
		 double purchaseTotal; 
		 
		 purchaseTotal = calculateProductSubtotal() + SALES_TAX;
		 
		 return purchaseTotal;
		 
	}
	
	public double printSummary() {
		System.out.println("Item: " +getName() +" Price: " +getPrice() + " Qty: " +getQuantity() +" Subtotal: $" +String.format("%,.2f", calculateProductSubtotal()));
		
		return calculateProductSubtotal();
	}
	
	
	public abstract void takeOrder(Scanner scanner);
		
	public abstract void addOptions(Scanner scanner);

	public abstract void printOptions();
	
	public abstract Product duplicateProduct(Product product);

}
