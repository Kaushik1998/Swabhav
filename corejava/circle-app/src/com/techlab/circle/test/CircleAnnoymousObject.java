package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleAnnoymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Circle());
		new Circle().setRadius(46f);
		System.out.println(new Circle().calculateArea());
		System.out.println(new Circle().hashCode());
		
	}

}
