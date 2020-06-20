package com.techlab.test;

import com.techlab.lineitem.LineItem;
import com.techlab.product.Product;
import com.techlab.product.Product.product;

public class Test {
	public static void main(String[] args) {
		Product apple = new Product(product.APPLE);
		LineItem la = new LineItem();
		la.addToCart(apple, 5);
		System.out.println(la.getAppleCount());
	}
}
