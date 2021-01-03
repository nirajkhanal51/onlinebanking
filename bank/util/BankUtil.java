package com.bank.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankUtil {
	
	public static final String URL = "jdbc:mysql://localhost:3306/bank_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root2015";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL,USER_NAME, PASSWORD);
		
	}

	public BankUtil() {
		
		Connection con;
 	}
	
	
	}