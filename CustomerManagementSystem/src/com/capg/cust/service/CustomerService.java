package com.capg.cust.service;

import java.util.List;


import com.capg.cust.bean.Customer;
import com.capg.cust.dao.CustomerDao;
import com.capg.cust.dao.ICustomerDao;

public class CustomerService implements ICustomerService {
	 
	  ICustomerDao dao=new CustomerDao();
	 public static boolean isValidCid(int cid)
	 { 
		 boolean flag=false;
		 if(cid!=0&&(cid>99&&cid<1000))
		 {
			 flag=true;
		 }
		 return flag;
	 }
	 public static boolean isValidCName(String cname)
	 {  
		  boolean flag=false ;
		  if(cname.length()>=3)
		  {
			  flag=true;
		  }
		  return flag;
	 }
     
	 public static boolean userValidation(Customer c)
	 {
		 boolean flag=false;
		 if(isValidCid(c.getCid())&&isValidCName(c.getcName()))
		 {
			 flag=true;
		 }
		 return  flag;
	 }
	 
	@Override
	public int addCustomer(Customer c) {
		 
		int x=dao.addCustomer(c);
		
		return 0;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerById(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
