package com.techlab.staticKeyword;

import com.techlab.staticKeyword.test.CounterWithStatic;
import com.techlab.staticKeyword.test.CounterWithoutStaticTest;

public class StaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterWithoutStaticTest obj1=new CounterWithoutStaticTest();
		CounterWithStatic obj2= new CounterWithStatic();
		
		System.out.println(obj1.getCounter());
		System.out.println(obj1.getCounter());
		System.out.println(obj2.getCounter());
		System.out.println(obj2.getCounter());
		System.out.println(obj2.getCounter());
		
	}

}
