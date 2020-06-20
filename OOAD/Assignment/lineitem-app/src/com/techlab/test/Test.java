package com.techlab.test;

import java.util.ArrayList;

import com.techlab.customer.Customer;
import com.techlab.order.Order;
import com.techlab.product.Product;
import com.techlab.product.Product.menu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer kaushik=new Customer("Kaushik",879,"Malad");
		
		Product mobile=new Product(menu.mobile);
		mobile.setCount(4);
		Product computer = new Product(menu.computer,1);
		Product laptop= new Product(menu.laptop,1);
		
		ArrayList <Product> products=new ArrayList<Product>();
		products.add(mobile);
		products.add(mobile);

		Order order=new Order(products);
		kaushik.placeOrder(order);
		
		System.out.println(kaushik);
	}

}
