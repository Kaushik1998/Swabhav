package com.techlab.kaushik_single;

public class SingletonClass {
	private static SingletonClass single = new SingletonClass();

	private SingletonClass() {

	}

	public static SingletonClass getObject() {
		return single;
	}

	public String message() {
		return "I am Single";
	}
}
