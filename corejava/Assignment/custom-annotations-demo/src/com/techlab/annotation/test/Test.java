package com.techlab.annotation.test;

import java.lang.reflect.*;
import com.techlab.annotation.Foo;
import com.techlab.annotation.Foo.TestCase;

public class Test {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo f = new Foo();
		printInfo(f);
	}

	public static void printInfo(Foo f)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		int pass = 0, fail = 0, total = 0;
		;
		Method[] methods = f.getClass().getMethods();
		for (Method m : methods) {
			if (m.isAnnotationPresent(TestCase.class)) {
				Object invoke = extracted(f, m);
				boolean output = (boolean) invoke;
				if (output == true) {
					pass++;
					total++;
				} else {
					fail++;
					total++;
				}
			}
		}
		System.out.println("Total : " + total);
		System.out.println("Passed : " + pass);
		System.out.println("Failed : " + fail);
	}

	private static Object extracted(Foo f, Method m) throws IllegalAccessException, InvocationTargetException {
		return m.invoke(f, null);
	}
}