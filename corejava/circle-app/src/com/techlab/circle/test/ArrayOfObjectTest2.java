package com.techlab.circle.test;

import com.techlab.circle.Circle;
import java.util.Random;

public class ArrayOfObjectTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle arrays[]=new Circle[3];
		for(int i=0;i<3;i++) {
			arrays[i]=new Circle();
			arrays[i].setRadius(new Random().nextFloat());
			System.out.println("Area" + i+" : " + arrays[i].calculateArea());
		}
		
		Circle n =findSmallArea(arrays);
		System.out.println("Smallest Area is : "+n.calculateArea());
		System.out.println("Smallest Perimeter is : "+ n.getPerimeter());
	}
	
	
	public static Circle findSmallArea(Circle data[]) {
		Circle r = new Circle();
		r.setRadius(data[0].getRadius());
		for(int i=0;i<data.length;i++) {
			if(data[i].calculateArea()<r.calculateArea())
			{
				r.setRadius(data[i].getRadius());
			}
		}
		return r;
	}
	
	public static Circle findSmallPerimeter(Circle data[]) {
		Circle r = new Circle();
		r.setRadius(data[0].getRadius());
		for(int i=0;i<data.length;i++) {
			if(data[i].calculateArea()<r.calculateArea())
			{
				r.setRadius(data[i].getRadius());
			}
		}
		return r;
	}

}
