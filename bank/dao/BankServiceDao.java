package com.bank.dao;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bank.model.BankCustomer;
import com.bank.util.BankUtil;


public class BankServiceDao  {

	
	public void createAccount(BankCustomer cust) throws ClassNotFoundException, SQLException {

		 try {
			 String sql_insert = "INSERT INTO account_tbl (account_no, account_name, email, mobile_no) VALUES (?, ?, ?, ?)";
			 
			 PreparedStatement st = BankUtil.getConnection().prepareStatement(sql_insert);

			 
			 st.setDouble(1, cust.getAccount_no());
			 st.setString(2, cust.getAccount_name());
			 st.setString(3, cust.getEmail());
			 st.setDouble(4, cust.getMobile_no());
			  
			 int rowsInserted = st.executeUpdate();
			 if (rowsInserted > 0) {
			     System.out.println("A new user was inserted successfully!");
			 }
			 st.close();
			
			
		} catch (Exception e) {
			e.getCause();
		} finally {
			 BankUtil.getConnection().close();
		}
		 
		
		
	}


	
	
	

}

	
