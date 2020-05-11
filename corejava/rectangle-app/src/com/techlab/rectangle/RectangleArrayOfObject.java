package com.techlab.rectangle;
public class RectangleArrayOfObject {

	public static void main(String[] args) {
		Rectangle[] objectArray = new Rectangle[3];
		new Rectangle()	;
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		objectArray[0] = new Rectangle();
		objectArray[1] = r1;		
		objectArray[2] = r2;
		
		objectArray[0].setLength(4f);
		objectArray[0].setBreadth(5f);
		System.out.println("Area Object 0 : "+objectArray[0].getArea());
		System.out.println("Perimeter Object 0"+objectArray[0].getPerimeter());
		
		objectArray[1].setLength(3f);
		objectArray[1].setBreadth(5f);
		System.out.println("Area Object 1 : "+objectArray[1].getArea());
		System.out.println("Perimeter Object 2 : "+objectArray[1].getPerimeter());
		
		objectArray[1].setLength(9f);
		objectArray[1].setBreadth(7f);
		System.out.println("Area Object 2 : "+objectArray[2].getArea());
		System.out.println("Perimeter Object 2 : "+objectArray[2].getPerimeter());
	}
}
