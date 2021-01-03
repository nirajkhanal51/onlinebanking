package com.bank.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.bank.dao.BankServiceDao;
import com.bank.model.BankCustomer;

public class CustomerController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		
		BankCustomer customer = new BankCustomer();
	
		BankServiceDao create = new BankServiceDao(); 
		
		
		System.out.println("Enter your Account Name:"  );
				
		 String acnt_name = input.nextLine();
		 customer.setAccount_name(acnt_name);
		 
		 System.out.println("Enter your Account Number: \n"  );					
			 int no = input.nextInt();
			 customer.setAccount_no(no);
			 
			 System.out.println("Enter your Email Address: \n"  );					
			 String email = input.next();
			customer.setEmail(email);	 
		 
			System.out.println("Enter your Mobile Number: \n"  );
						
				double mbl = input.nextDouble();
				customer.setMobile_no(mbl);
		
		create.createAccount(customer);
		
		
	}

}
