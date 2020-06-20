package com.techlab.customer;

import java.util.ArrayList;

import com.techlab.order.Order;

public class Customer {
	private String name;
	private int customerID;
	private String address;
	private int totalCost;

	public Customer(String name, int customerID, String address) {
		super();
		this.name = name;
		this.customerID = customerID;
		this.address = address;
	}

	ArrayList<Order> orders = new ArrayList<Order>();

	public void placeOrder(Order order) {
		orders.add(order);
		totalCost += order.cart.getCartCost();
	}
	
	public void removeOrder(int index) {
		orders.remove(index);
	}

	@Override
	public String toString() {
		return "Customer Name= " + name + ", CustomerID= " + customerID + ", Address= " + address + "\n"
				+ "Orders placed :\n" + orders + "\nTotal Cost : " + totalCost + "\n";
	}
}
