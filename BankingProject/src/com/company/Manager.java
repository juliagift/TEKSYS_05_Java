package com.company;

public class Manager extends Employee implements AccountActionsIMPL{            //Manager-child  Employee-parent
	
	//fields
	private String timeCards;
	
	public Manager() {
		
	}

	public Manager(String firstName, String lastName, long emplId, String jobTitle, String timeCards) {
		super(firstName, lastName, emplId, jobTitle);
		this.timeCards = timeCards;
	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [timeCards=" + timeCards + "]";
	}

	@Override
	public void withdraw(float amount, float withdrawAmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(float amount, float depositAmount) {
		// TODO Auto-generated method stub
		
	}
	
	// any number of arguments of given datatype int
	public void printThis(int ...val) {
		for(int i : val) {
			System.out.println(i);
		}
	}

	

}
