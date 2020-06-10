package com.techlab.exception;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		m1();
		System.out.println("End of program");

		System.out.println("Program Ends");

	}

	public static void m1() throws Exception {
		System.out.println("M1 is called");
		m2();
	}

	public static void m2() throws Exception {
		System.out.println("M2 is called");
		m3();
	}

	public static void m3() throws Exception {
		System.out.println("M3 is called");

		throw new Exception("There is some problem");
	}

}