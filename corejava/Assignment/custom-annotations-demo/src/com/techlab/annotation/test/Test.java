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
		int pass = 0, fail = 0, count = 0;
		;
		Method[] methods = f.getClass().getMethods();
		for (Method m : methods) {
			if (m.isAnnotationPresent(TestCase.class)) {
				boolean result = (boolean) m.invoke(f, null);
				if (result == true) {
					pass++;
					count++;
				} else {
					fail++;
					count++;
				}
			}
		}
		System.out.println("Total : " + count);
		System.out.println("Passed : " + pass);
		System.out.println("Failed : " + fail);
	}
}