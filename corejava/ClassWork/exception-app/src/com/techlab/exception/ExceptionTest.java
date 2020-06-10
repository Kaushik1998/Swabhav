package com.techlab.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("This is the end");
			e.printStackTrace();
		}
		System.out.println("End of the main");
	}
	static public void m1() throws Exception{
		System.out.println("Inside M!");
		m2();
	}
	private static void m2() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside m2");
		m3();
	}
	private static void m3() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside M3");
		throw new Exception("This is Exception");
	}
	
	
}
