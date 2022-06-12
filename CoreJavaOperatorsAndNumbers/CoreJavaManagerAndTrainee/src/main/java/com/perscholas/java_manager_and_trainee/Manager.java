package com.perscholas.java_manager_and_trainee;

public class Manager extends Employee {
	
	
	public Manager(long id, String Name, String address, long phone) {
		super(id, Name, address, phone);
	}

	public Manager(long id, String Name, String address, long phone,
			double salary) {
		super(id, Name, address, phone);
		this.basicSalary = salary;
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = 0.15 * basicSalary;
		return transportAllowance;
	}

	
	
	

}
