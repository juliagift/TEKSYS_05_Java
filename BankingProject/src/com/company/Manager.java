package com.company;

public class Manager extends Employee {            //Manager-child  Employee-parent
	
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

	

	

	
	
	

	

}
