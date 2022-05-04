package com.perscholas.connection_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
	

	
	//https://www.macupdate.com/app/mac/21037/mysql-connectorj
	//universal connector
	private final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private final String url =  "jdbc:mysql://localhost/classicmodels"; 
	private final String username = "root";
	private final String password = "theboy";
	private static FactoryConnection factoryConnection = null;
	
	private FactoryConnection() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			System.out.println("Exception in FactoryConnection class");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
	
	public static FactoryConnection getInstance() {
		if(factoryConnection == null) {
			factoryConnection = new FactoryConnection();
		}
		return factoryConnection;		
	}
}
