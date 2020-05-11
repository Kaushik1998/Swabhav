package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = c1;
		c1.setRadius(11f);
		System.out.println(c2.getRadius());
		printInfo(c1,c2);
	}
	
	static void printInfo(Circle c1, Circle c2)
	{
	System.out.println(c1.getRadius());
	System.out.println(c1.getColor());
	System.out.println(c1.calculateArea());
	System.out.println(c1.getPerimeter());
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());

}

}
