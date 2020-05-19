package com.techlab.customer;

public class BoxingTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 1;
		int i2 = 1;
		System.out.println("i1==i2: " + (i1 == i2));
		
		Integer num1 = 1;
		int num2 = 1;
		System.out.println("num1 == num2: " + (num1 == num2));
		
		Integer one = new Integer(1);
		Integer anotherOne = new Integer(1);
		System.out.println("one==anotherOne: " +(one==anotherOne));
		
		Integer i = 35;
		Double d = 33.3;
		d = d + i;
		System.out.println("d:" +d);
	}

}
