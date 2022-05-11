package com.perscholas.connection_jdbc;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		EmployeeDAO employeeOne = new EmployeeDAO();
		
		
		EmployeeModel employeeModelOne = new EmployeeModel();
		
		System.out.println(employeeOne.getEmployeeById(1002));
		
		try {
			employeeOne.createNewEmployee();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		



	}

}

