package com.techlab.shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: " + this);
	}

	@Override
	public String toString() {
		return "Circle";
	}

}
