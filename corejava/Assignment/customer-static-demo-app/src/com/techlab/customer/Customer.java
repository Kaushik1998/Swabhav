package com.techlab.customer;

import java.util.Random;

public class Customer {
	private String accNo;
	private int orders;
	
	public Customer(String name,int orders){
		generateAccount();
		this.orders=orders;
	}
	
	public void generateAccount() {
		int i =new Random().nextInt(1000);
		accNo=String.valueOf(i);
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public int getOrders() {
		return orders;
	}
}
