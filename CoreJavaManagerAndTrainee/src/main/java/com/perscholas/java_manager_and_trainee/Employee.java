package com.perscholas.java_manager_and_trainee;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee() {
		
	}
	
	public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
	}

	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * (specialAllowance/100)) + (basicSalary * (hra/100));
		return salary;
		
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance = 0.1 * basicSalary;
		return transportAllowance;
		
	}
	
	

}
