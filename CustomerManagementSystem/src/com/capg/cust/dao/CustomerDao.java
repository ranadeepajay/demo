
































































































































package com.capg.cust.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capg.cust.bean.Customer;

public class CustomerDao implements ICustomerDao {
   
	 Connection conn=DButil.getDBConnection();
	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		int count=0;
		 try {
			PreparedStatement pstmt  =conn.prepareStatement(IQueryMapper.INSERT_CUSTOMER);
			 pstmt.setInt(1, c.getCid());
			 pstmt.setString(2,c.getcName());
			 pstmt.setDouble(3, c.getAmount());
			 
			 count =pstmt.executeUpdate();
			 
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return count;
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
