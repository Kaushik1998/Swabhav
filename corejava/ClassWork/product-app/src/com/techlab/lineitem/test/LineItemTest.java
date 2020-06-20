package com.techlab.lineitem.test;
import java.util.Map;
import com.techlab.lineitem.LineItem;
import com.techlab.product.Product;
import com.techlab.product.Product.product;

public class LineItemTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineItem cart = new LineItem();
		Product apple = new Product(product.APPLE);
		Product banana = new Product(product.BANANA);
		Product orange = new Product(product.ORANGE);
		cart.addToCart(banana, 6);
		cart.addToCart(apple, 5);
		cart.addToCart(orange, 3);		
		
		//displayCart(cart.getCart());
		//System.out.println(cart.getTotal());
		System.out.println(cart.getCart());
	}

	static void displayCart(Map<Product, Integer> cart) {
		for (Product i : cart.keySet()) {
			System.out.println("\tUnit : " + i.getProduct() + "\tQuantity : " + cart.get(i));
		}
	}
}
