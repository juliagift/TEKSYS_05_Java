package com.company;

public class Employee {
	
	//fields  Java Classes slide 14
	private String firstName;
	private String lastName;
	private long emplId;
	private String jobTitle;  
	//protected-accessible by class and subclass
	
	public Employee() {
		
	}
	
	//constructor overloading
	public Employee(String firstName, String lastName, long emplId, String jobTitle) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emplId = emplId;
		this.jobTitle = jobTitle;
	}
	
	public Employee(String firstName, String lastName, long emplId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emplId = emplId;
	}
	
	public Employee(String firstName, long emplId) {
		this.firstName = firstName;
		this.emplId = emplId;
	}


	public String getFirstName() {
		return firstName;
	}
	
	//void does not return anything
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmplId() {
		return emplId;
	}

	public void setEmplId(long emplId) {
		this.emplId = emplId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee ["
				+ "firstName=" + firstName + ", "
				+ "lastName=" + lastName 
				+ ", emplId=" + emplId 
				+ ", jobTitle=" + jobTitle + "]";
	}
	
	//other methods
	

}
