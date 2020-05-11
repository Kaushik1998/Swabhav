package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle objectArray[]=new Circle[3];
		Circle o1 = new Circle();
		Circle o2 = new Circle();
		//It was before 
		// Default package was a mistake before
		//I had errors copying package
		//I saw a method to copy package . Didnt work 
		// Mam? Visible
		//Reference 
		//I missed the reference test
		//Ok
		objectArray[0]= new Circle();
		objectArray[1]=o1;
		objectArray[2]=o2;
		
		objectArray[0].setRadius(5f);
		objectArray[0].setColor("pInK");
		System.out.println("Area Object 0 : "+objectArray[0].calculateArea());
		System.out.println("Perimeter Object 0 :"+objectArray[0].getPerimeter());
		System.out.println("Color Object 0 : "+objectArray[0].getColor());
		
		objectArray[1].setRadius(8f);
		objectArray[1].setColor("blACK");
		System.out.println("Area Object 1 : "+objectArray[1].calculateArea());
		System.out.println("Perimeter Object 1 :"+objectArray[1].getPerimeter());
		System.out.println("Color Object 1 : "+objectArray[1].getColor());
		
		objectArray[2].setRadius(6f);
		objectArray[2].setColor("gRAY");
		System.out.println("Area Object 2 : "+objectArray[2].calculateArea());
		System.out.println("Perimeter Object 2 :"+objectArray[2].getPerimeter());
		System.out.println("Color Object 2 : "+objectArray[2].getColor());
		
	}

}
