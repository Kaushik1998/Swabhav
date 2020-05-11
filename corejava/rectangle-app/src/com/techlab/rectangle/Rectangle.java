package com.techlab.rectangle;

public class Rectangle {
	private static float length = 10f;
	private static float breadth = 15f;
	
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}
	public void setLength(float num) {
		if (num > 0 && num <= 100) {
			length = num;
		} else if (num < 0) {
			length = 1;
		} else if (num > 100) {
			length = 100;
		}
	}

	public void setBreadth(float num) {
		if (num > 0 && num <= 100) {
			breadth = num;
		} else if (num < 0) {
			breadth = 1;
		} else if (num > 100) {
			breadth = 100;
		}
	}

	public float getArea() {
		return length * breadth;
	}
	
	public float getPerimeter() {
		return (2*(length+breadth));
	}
	
	public static  int getHashCode(Rectangle r) {
		return r.hashCode();
	}
	
	public static void printInfo(Rectangle r) { 
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.getArea());
		
		
	}

}
