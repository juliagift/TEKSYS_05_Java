package com.company;

public abstract class AbstractAccountActtions {
	
	String bankAccount;
	
	//default constructor
	public AbstractAccountActtions() {
		
	}
	 
	public AbstractAccountActtions(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	//no method body
	abstract float withdraw(int amount, int withdrawAmount);
	abstract float deposit(int amount, int depositAmount);
	
	public String getBankAccount() {
		return bankAccount;
	}

}
