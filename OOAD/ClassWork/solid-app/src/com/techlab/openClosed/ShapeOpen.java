package com.techlab.openClosed;

public class ShapeOpen {

}

abstract class Area {
	public abstract void area();
}

class Rectangle extends Area {

	@Override
	public void area() {
		int length = 0, breadth = 0;
		// TODO Auto-generated method stub
		int area = length * breadth;
	}

}

class Circle extends Area{

	@Override
	public void area() {
		int radius = 0;
		// TODO Auto-generated method stub
		int area= (int) (3.14 * radius*radius);
	}
	
}
