package com.capg.cust.ui;

import java.sql.Date;
import java.util.Scanner;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerService;
import com.capg.cust.service.ICustomerService;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		ICustomerService  service=new CustomerService();
		
		while(true)
		{
			System.out.println("*****menu*****");
			System.out.println("*1.add customer*");
			System.out.println("*2.update customer*");
			System.out.println("*3.select customer By id*");
			System.out.println("*4.select customer by id*");
			System.out.println("*5.select all customer *");
			System.out.println("*6.exit*");
			
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("enter ur choice");
			int choice =in.nextInt();
			 switch (choice) {
			case 1:
				 
				Customer customerBean=new Customer();
				System.out.println("enter id");
				 int cid=in.nextInt();
				 in.nextLine();
				 System.out.println("enter name");
				 String cName=in.nextLine();
				 // in.nextLine();
				 System.out.println("enter amount");
				 double amount=in.nextDouble();
				 
				 
				 //Date doj= Date.valueOf(in.nextLine());
				 customerBean.setAmount(amount);
				 customerBean.setCid(cid);
				 customerBean.setcName(cName);
				// customerBean.setDoj(doj);
			    boolean isvalid= CustomerService.userValidation(customerBean);
			    if(isvalid) {
			      int x =service.addCustomer(customerBean);
			    }
			    else
			    {
			    	continue;
			    }
				break;
			case 2:
				
				break;
				
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				 System.err.println("invalid choice try again");
				break;
			}
			
		}
		

	}

}
