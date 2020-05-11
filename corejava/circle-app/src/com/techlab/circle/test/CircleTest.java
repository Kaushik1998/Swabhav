package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		float test = 5.0f;
		Circle c =new Circle();
		c.setRadius(test);
		float r = c.getRadius();
		double a = c.calculateArea();
		double p = c.getPerimeter();
		
		System.out.println(r);
		System.out.println(a);
		System.out.println(p);
	}
}
