package com.perscholas.java_exception;

public class CustomException extends Exception {
	
	private double amount;
	
	public CustomException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
