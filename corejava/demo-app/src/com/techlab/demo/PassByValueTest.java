package com.techlab.demo;

public class PassByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		mutableData(a); // 10,20??

		int[] arr = { 10, 20, 30, 40 };
		mutableArrayvalue(arr); // 10,20,30,40.............0 0 0 0??
	}

	static void mutableData(int n) {
		n = 20;
	}

	static void mutableArrayvalue(int[] a) // ref=actual address data
	{
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;
		}
	}
}
