package com.perscholas.java_manager_and_trainee;

public class Trainee extends Employee {
	


	public Trainee(long id, String Name, String address, long phone) {
		super(id, Name, address, phone);
	}

	public Trainee(long id, String Name, String address, long phone, double salary) {
		super(id, Name, address, phone);
		this.basicSalary = salary;
	}
	
	

}
