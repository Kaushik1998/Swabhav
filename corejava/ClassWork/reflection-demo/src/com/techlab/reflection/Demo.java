package com.techlab.reflection;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void automaticTypeCasting() {
	      int i = 100;
	      long l = i; //no explicit type casting required
	      float f = l;  //no explicit type casting required
	      System.out.println("Int value "+i);
	      System.out.println("Long value "+l);
	      System.out.println("Float value "+f);
	}
}
