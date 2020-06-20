package com.techlab.lineitem;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.techlab.product.Product;
import com.techlab.product.Product.product;

public class LineItemJUnit4Test {

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each");
	}
	
	@BeforeClass
	static void init() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	static void afterEachtest() {
		System.out.println("After Class");
	}
	
	@Before
	void test() {
		System.out.println("Before");
	}
	
	@After
	void after() {
		System.out.println("After");
	}
	
	@Test
	void appleAddToCart() {
		
		int expectedAppleCount= 5;
		
		Product apple =new Product(product.APPLE);
		LineItem l=new LineItem();
		l.addToCart(apple, 5);
		System.out.println("Test");
		
		assertEquals(expectedAppleCount, l.getAppleCount());
	}
	
	@Test
	void orangeAddToCart() {
		
		int expectedOrangeCount= 5;
		
		Product orange =new Product(product.ORANGE);
		LineItem l=new LineItem();
		l.addToCart(orange, 5);
		System.out.println("Test");
		
		assertEquals(expectedOrangeCount, l.getOrangeCount());
	}

}
