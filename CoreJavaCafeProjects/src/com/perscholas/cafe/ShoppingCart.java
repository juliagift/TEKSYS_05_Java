package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Product> products = new ArrayList<>();

	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void printShoppingCart() {
		double subtotal = 0;
		
		for(int i = 0; i < products.size(); i++) {
			subtotal += products.get(i).printSummary();
			products.get(i).printOptions();
			System.out.println();
		}
		System.out.println("Product subtotal: $" + String.format("%,.2f", subtotal));
		
		double salesTax = Product.SALES_TAX * subtotal;
		System.out.println("Sales tax: $" + String.format("%,.2f", salesTax));
		System.out.println("Total: $" + String.format("%,.2f", (subtotal + salesTax)));
	}
	
	//exceptions
}
