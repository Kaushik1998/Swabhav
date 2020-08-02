package com.techlab.shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: " + this);
	}

	@Override
	public String toString() {
		return "Rectangle";
	}

}
