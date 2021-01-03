package com.create.dbandtables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateAcccount_tbl {
	
	public  static final String URL = "jdbc:mysql://localhost:3306/bank_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root2015" ; 
	public static final String SQL = "create table account_tbl (id int not null auto_increment, account_no int not null,account_name varchar(50), email varchar(50), mobile_no int, primary key(id))";


	public static void main(String[] args) {

		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD); 
				Statement st = con.createStatement();
				)  
		{
			st.executeUpdate(SQL); 
			System.out.println("table created");//just to make sure if the codes worked
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		
	}

}
	


