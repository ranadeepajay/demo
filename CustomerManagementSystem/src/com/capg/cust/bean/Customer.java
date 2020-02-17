package com.capg.cust.bean;

import java.sql.Date;

public class Customer {
	private int cid;
	private String cName;
	private double amount;
	private  Date doj;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", amount=" + amount + ", doj=" + doj + "]";
	}
	 
	
	

}
