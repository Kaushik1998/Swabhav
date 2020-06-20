package com.techlab.test;

import java.io.IOException;

import com.techlab.customer.Customer;
import com.techlab.product.Apple;
import com.techlab.product.Banana;
import com.techlab.product.Mango;
import com.techlab.product.Product;
import com.techlab.serialize.Serialize;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Customer l = new Customer("Kaushik","Malad");
		Product apple = new Apple();
		Product apple2=new Apple();
		Product mango = new Mango();
		Product banana = new Banana();
		l.add(apple, 3);
		l.add(apple2,4);
		System.out.println(l);
		
	}

}
