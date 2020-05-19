package com.techlab.staticKeyword.test;

public class CounterWithoutStaticTest {

	int count = 0;
	public CounterWithoutStaticTest() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CounterWithoutStaticTest c1 = new CounterWithoutStaticTest();
		CounterWithoutStaticTest c2 = new CounterWithoutStaticTest();
		CounterWithoutStaticTest c3 = new CounterWithoutStaticTest();
		
	}

}