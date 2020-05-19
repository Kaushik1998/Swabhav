package com.techlab.wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automaticTypeCasting();
		explicitTypeCasting();
		unboxing();
		boxing();
	}

	static void automaticTypeCasting() {
		int i = 100;
		long l = i;
		float f = l;
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
	}

	static void explicitTypeCasting() {
		double d = 100.04;
		long l = (long) d;
		int i = (int) l;

		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);
	}

	static void unboxing() {
		System.out.println("Auto-Unboxing");
		Integer iObject = new Integer(10);

		int iPrimitive = iObject;

		System.out.println("Value of i: " + iObject);
		System.out.println("Value of i1: " + iPrimitive);

		System.out.println("Implicit UnBoxing");
		iObject = new Integer(80);
		int iData = iObject;
		System.out.println(iData);
	}

	static void boxing() {
		System.out.println("Auto-Unboxing");
		Integer iObject = new Integer(10);

		int iPrimitive = iObject;

		System.out.println("Value of iObject: " + iObject);
		System.out.println("Value of iPrimitive: " + iPrimitive);

		System.out.println("Implicit Boxing");
		int iData = 5;
		iObject = new Integer(iData);
		System.out.println(iObject);
	}
}
