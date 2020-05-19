package com.techlab.customer.test;

import com.techlab.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1,c2,c3;
		c1=new Customer("abc",10);
		c2=new Customer("pqr",20);
		c3=new Customer("xyz",30);
		System.out.println(c1.getAccNo());
		System.out.println(c2.getAccNo());
		System.out.println(c3.getAccNo());
	}

}
