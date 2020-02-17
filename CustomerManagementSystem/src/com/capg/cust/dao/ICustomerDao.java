package com.capg.cust.dao;

import java.util.List;

import com.capg.cust.bean.Customer;

public interface ICustomerDao {
	
	
	
	int   addCustomer(Customer c);
    int  updateCustomer(Customer c);
     Customer     getCustomerById(int cid);
 int deleteCustomerById(int cid);
 List<Customer> getAllCustomers();

}
