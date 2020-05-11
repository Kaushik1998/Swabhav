package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Rectangle r1 =r;
		System.out.println(r.hashCode());
		System.out.println(r1.hashCode());
	}


}
