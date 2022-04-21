package com.company;

public class Main {

	public static void main(String[] args) {  //static identifie
		
		//object and memory slide 8, 10, 14
		
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
		Employee empTwo = new Employee("Mark", "Smith", 4322, "Sales");
		Employee empThree = new Employee("Julia", 234);
		
		Manager managerOne = new Manager("Bob", "Doe", 4533, "Manager", "Sales TimeCards");
		Manager managerTwo = new Manager();
		managerTwo.setFirstName("Mark");
		managerTwo.setLastName("Jones");
		managerTwo.setJobTitle("VIP");
		managerTwo.setEmplId(987765);
		managerTwo.setTimeCards("Mine");
		
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(managerOne);
		System.out.println(managerTwo.getFirstName());
		

	}

}
//static- methods or variables belong to the class and not the instance of the class
//new- creates new memory in the heap