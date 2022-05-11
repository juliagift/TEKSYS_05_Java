package com.perscholas.connection_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {
	
	Connection connection = null;
	PreparedStatement ps = null;  
	ResultSet resultSet = null;
	
	public EmployeeDAO() {
		
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn;
		conn = FactoryConnection.getInstance().getConnection();
		return conn;
	}
	
	public EmployeeModel getEmployeeById(int id) {
		
		EmployeeModel employeeModel = new EmployeeModel();
		
		try {
			connection = getConnection();
			String sql = "SELECT * FROM employees WHERE employeeNumber = ?";
			
			
			ps = connection.prepareStatement(sql);
			
			ps.setInt(1, 1056);
			
			resultSet = ps.executeQuery();
			
			while(resultSet.next()) {
				EmployeeModel employee = new EmployeeModel();
				employee.setEmployeeNumber(resultSet.getInt("employeeNumber"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setExtension(resultSet.getString("extension"));
				employee.setJobTitle(resultSet.getString("jobTitle"));	
				
				System.out.println(
						"EmployeeNumber: " +resultSet.getInt("employeeNumber") + ", "+
						"First Name: " + resultSet.getString("firstName")+ ", "+
						"Last Name: " + resultSet.getString("lastName")+", "+
						"Job Title: " + resultSet.getString("jobTitle")
						
						
						);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeeModel;
	}
	
	public EmployeeModel createNewEmployee() throws SQLException {
		
		EmployeeModel employee = new EmployeeModel();
		
		try {
			connection = getConnection();
			String sql = "INSERT INTO classicmodels.employees"
					     + "(employeeNumber, lasttName, firsttName, extension, email, officeCode, jobTitle) "
					     + "values (?, ?, ?, ?, ?, ?, ?)";
			
			ps = connection.prepareStatement(sql);
			
			ps.setInt(1, 1823);
			ps.setString(2, "Julia");
			ps.setString(3, "Gift");
			ps.setString(4, "x3666");
			ps.setString(5, "gugecguieg@gmail.com");
			ps.setString(6, "4");
			ps.setString(7, "Sales Rep");
			
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return employee;
		
	}

}
