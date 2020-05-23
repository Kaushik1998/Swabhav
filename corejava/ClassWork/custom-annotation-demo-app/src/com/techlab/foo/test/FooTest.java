package com.techlab.foo.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.foo.Foo;
import com.techlab.foo.Foo.RequireRefactor;

public class FooTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f=new Foo();
		printInfo(f);
	}
	static void printInfo(Foo f) {
		int count=0;
		Class c=f.getClass();
		Method methodArray[]=c.getMethods();
		for(Method m:methodArray) {
			Annotation[] anno=m.getDeclaredAnnotations();
					for(Annotation a:anno) {
						System.out.print("Method "+m.getName());
						System.out.print(" has annotation ");
						System.out.println(a);
						count++;
					}
		}
		System.out.println("Total count of annotations : " + count);
	}
}
