package com.company;

enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {
	//reference of the enum
	AccountTypes accountTypes;
	
	
	//class constructor
	public Accounts(AccountTypes accountTypes) {
		super();
		this.accountTypes = accountTypes;
	}
	
	//method to choose account types
	public void chooseAccount() {
		switch(accountTypes) {
		case CHECKING:
			System.out.println("You chose Checking!");
			break;
		case SAVINGS:
			System.out.println("You chose Savings!");
			break;
		case CREDIT:
			System.out.println("You chose Credit!");
			break;
		}
	}

}
