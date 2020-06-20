package com.techlab.lineitem;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.techlab.product.Product;
import com.techlab.product.Product.product;

import junit.framework.TestCase;

public class LineItemJUnitTest extends TestCase {

	LineItem l = new LineItem();
	Product orange = new Product(product.ORANGE);

	@Test
	public void testEqualTotal() {
		int total = 0;
		assertEquals(new LineItem().getTotal(), total);
	}

	@Test
	public void testNotEqualTotal() {
		int total = 0;
		assertNotEquals(new LineItem().getTotal(), total);
	}

}
