package com.techlab.circle.test;

import com.techlab.circle.Circle;
import java.util.Random;

public class ArrayOfObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle arrays[]=new Circle[3];
		for(int i=0;i<3;i++) {
			arrays[i]=new Circle();
			arrays[i].setRadius(new Random().nextFloat());
			System.out.println("Area" + i+" : " + arrays[i].calculateArea());
		}
		float smallestArea = findSmallArea(arrays);
		float smallestPerimeter = findSmallPerimeter(arrays);
		System.out.println("Smallest Area : "+smallestArea);
		System.out.println("Smallest Perimeter : " + smallestPerimeter);
		
	}
	
	public static float findSmallArea(Circle data[]) {
		float smallArea = data[0].calculateArea();
		for(int i=0;i<data.length;i++) {
			if (data[i].calculateArea()<smallArea) {
				smallArea=data[i].calculateArea();
			}
		}
		return smallArea;
	}
	
	public static float findSmallPerimeter(Circle data[]) {
		float smallPerimeter = data[0].getPerimeter();
		for(int i=0;i<data.length;i++) {
			if (data[i].getPerimeter()<smallPerimeter) {
				smallPerimeter=data[i].getPerimeter();
			}
		}
		return smallPerimeter;
	}
		
	

}
