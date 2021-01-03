package com.create.dbandtables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTransaction_tbl {
	
	public  static final String URL = "jdbc:mysql://localhost:3306/bank_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root2015" ; 
	public static final String SQL = "create table transaction_tbl (id int, deposited_date date, withdrawn_amount bigint, deposit_amount bigint, balance bigint not null,email varchar(50), mobile_no int, foreign key(id) references account_tbl(id))";


	public static void main(String[] args) {
		try (
				Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD); 
				Statement st = con.createStatement();
				)  
		{
			st.executeUpdate(SQL); 
			System.out.println("transaction_ table created");//just to make sure if the codes worked
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		
	}

}
	


