package com.create.dbandtables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_BankDB {

			
		public  static final String URL = "jdbc:mysql://localhost:3306/";
		public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
		public static final String USER_NAME = "root";
		public static final String PASSWORD = "root2015" ; 
		public static final String SQL = "create database bank_db";
		
		
		public static void main(String[] args) {
					
			Connection con = null;
			Statement  st  = null; 
			
			try {
				//Step-1 register the driver			
				Class.forName(DRIVER_NAME); //this step is not necessary after java 6
				
				//step -2 get connection object
				 con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				
				//step 3 get statement object
				st = con.createStatement();
				
				//step 4 execute the query
				
				st.executeUpdate(SQL);
				
				System.out.println("Database created.");
							 
				
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			} 
			//Step -5 close the connection
			finally {
				
				try {
					con.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
	}


	
