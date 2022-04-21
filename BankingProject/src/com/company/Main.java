package com.company;

public class Main {

	public static void main(String[] args) {  
		
		//object and memory slide 8, 10, 14
		
		Employee empOne = new Employee("John", "Smith", 12345, "Sales");
		empOne.withdraw(200, 50);
		
		Employee empTwo = new Employee("Mark", "Smith", 4322, "Sales");
		Employee empThree = new Employee("Julia", 234);
		
		Manager managerOne = new Manager("Bob", "Doe", 4533, "Manager", "Sales TimeCards");
		Manager managerTwo = new Manager();
		managerTwo.setFirstName("Mark");
		managerTwo.setLastName("Jones");
		managerTwo.setJobTitle("VIP");
		managerTwo.setEmplId(987765);
		managerTwo.setTimeCards("Mine");
		managerOne.printThis(1,4,5,6,7,88766,55,5,53,33);
//		
//		System.out.println(empOne);
//		System.out.println(empTwo);
//		System.out.println(empThree);
//		System.out.println(managerOne);
//		System.out.println(managerTwo.getFirstName());
//		System.out.println(empOne.withdraw(200, 50));
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(234);
		intBox.add(435);
		intBox.add(867);
		intBox.add(678);
		
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		strBox.add("Hi");
		strBox.add("Hello");
		
		System.out.println(strBox.get());
		
		String str = "CHECKING";
		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
		
		accOne.chooseAccount();
		
		ExampleClass.NestedClass.hello();
		

	}

}
//static- methods or variables belong to the class and not the instance of the class
//new- creates new memory in the heap