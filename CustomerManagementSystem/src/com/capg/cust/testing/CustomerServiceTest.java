package com.capg.cust.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.cust.bean.Customer;
import com.capg.cust.service.CustomerService;
import com.capg.cust.service.ICustomerService;

class CustomerServiceTest {
   
	
	static ICustomerService service;
	
	@BeforeAll
	public static void setUP()
	{
		
		service=new CustomerService();
		
	}
	
	
	@Test
	void testIsValidCName() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddCustomer() {
	   //	fail("Not yet implemented");
		Customer c=new Customer();
		c.setCid(103);
		c.setAmount(5000);
		c.setcName("ajay");
		c.setDoj(new Date(2020,5, 1));
		service.addCustomer(c);
		
	}

}
