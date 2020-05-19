package com.techlab.staticKeyword.test;

public class CounterWithStatic {

	static int count = 0;
	public CounterWithStatic() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterWithStatic c1 = new CounterWithStatic();
		CounterWithStatic c2 = new CounterWithStatic();
		CounterWithStatic c3 = new CounterWithStatic();
		
	}

}


