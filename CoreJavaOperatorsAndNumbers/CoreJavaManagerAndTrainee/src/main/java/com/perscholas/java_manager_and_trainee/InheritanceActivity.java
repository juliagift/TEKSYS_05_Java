package com.perscholas.java_manager_and_trainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manager = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		Trainee trainee = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);

		double managerSalary = manager.calculateSalary();
		double traineeSalary = trainee.calculateSalary();
		double managerTransportAllowance = manager.calculateTransportAllowance();
		double traineeTransportAllowance = trainee.calculateTransportAllowance();
		
		System.out.println("Manager's salary: $" + String.format("%,.2f", managerSalary));
		System.out.println("Manager's transport allowance: $" + String.format("%,.2f", managerTransportAllowance));
		System.out.println("Manager's total salary: $" + String.format("%,.2f", (managerSalary + managerTransportAllowance)));
		System.out.println();
		System.out.println("Trainee's salary: $" +  String.format("%,.2f", traineeSalary));
		System.out.println("Trainee's transport allowance: $" + String.format("%,.2f", traineeTransportAllowance));
		System.out.println("Trainee's total salary: $" + String.format("%,.2f", (traineeSalary + traineeTransportAllowance)));
	}
}
