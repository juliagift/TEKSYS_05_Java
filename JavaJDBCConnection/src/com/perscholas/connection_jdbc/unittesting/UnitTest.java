package com.perscholas.connection_jdbc.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.perscholas.connection_jdbc.EmployeeDAO;
import com.perscholas.connection_jdbc.EmployeeModel;
import com.perscholas.connection_jdbc.FactoryConnection;

public class UnitTest {
	
	static Connection connection = null;
	Statement stmt = null;  
	PreparedStatement ps = null;
	ResultSet rs = null;
	EmployeeDAO employeeDAO = new EmployeeDAO();
	
	@BeforeAll
	public static void setUp() {
	
		try {
			connection = FactoryConnection.getInstance().getConnection();
			System.out.println("Before Class");
		} 
		catch (SQLException e)
		{
			e.getMessage();
			System.out.println("SQL Exception");
		}
	}
	
	@BeforeEach
	public void beforeEachMethod() throws SQLException {
		
		System.out.println("Run Before Each Test Method");
		
	}
	
	@Test
	public void testGetEmployeeById() throws SQLException {
		EmployeeModel actual = employeeDAO.getEmployeeById(1056);
		
		Boolean b = actual.equals("Mary");
		assertFalse(b);
		
		System.out.println("Testing get employee by id");
		System.out.println(actual);
	}
	
	
	@Test
	public void testFactoryConnection() throws ClassNotFoundException {
		final String driverClassName = "com.mysql.cj.jdbc.Driver";
		assertNotEquals(driverClassName, Class.forName(driverClassName));
		System.out.println("test factory connection");
	}
	
	@AfterEach
	public void afterEachMethod() throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		System.out.println("After Each Test");
	}
	
	@AfterAll
	public static void tearDown() throws SQLException {
		if (connection != null) {
			connection.close();
		}
		assertNull(connection);
		System.out.println("After the class");
		
	}
	
	

}
