package com.techlab.customer;

import java.io.Serializable;

import com.techlab.order.Order;
import com.techlab.product.Product;

public class Customer implements Serializable {
	Order order = new Order();
	private int customerID;
	private String customerName;
	private String address;

	public Customer(String customerName, String address) {
		this.customerID = hashCode();
		this.customerName = customerName;
		this.address = address;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getAddress() {
		return address;
	}

	public void add(Product p) {
		order.add(p);
	}

	public void add(Product p, int quantity) {
		order.add(p, quantity);
	}
	
	public void remove(Product p,int quantity) {
		order.add(p,-quantity);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer Name :");
		builder.append(customerName);
		builder.append("\nCustomer ID :");
		builder.append(customerID);
		builder.append("\nCustomer Address :");
		builder.append(address+"\n");
		builder.append(order);
		return builder.toString();
	}

}
