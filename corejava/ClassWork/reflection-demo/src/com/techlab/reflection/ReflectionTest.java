package com.techlab.reflection;

import java.lang.reflect.*;

import com.techlab.Person.Person;

public class ReflectionTest {
	
	public static void main(String[] args) {
		Person p=new Person("kaushi8","Male",15f,18f);
		Class reflectClass = p.getClass();
		Method classMethods[] = reflectClass.getMethods();
		Constructor constructors[]=reflectClass.getConstructors();
		printMethodInfo(classMethods);
		printGetterInfo(classMethods);
		printConstructorInfo(constructors);
	}
	
	static void printMethodInfo(Method classMethods[]) {
		for(Method method : classMethods) {
			System.out.println("Method : " + method.getName());
		}
	}
	
	static void printGetterInfo(Method classMethods[]) {
		for(Method method : classMethods) {
			if(method.getName().startsWith("get")) {
				System.out.println("Getter Method : " + method.getName());
			}
		}
	}
	
	static void printSetterInfo(Method classMethods[]) {
		for(Method method : classMethods) {
			if(method.getName().startsWith("set")) {
				System.out.println("Setter Method : " + method.getName());
			}
		}
	}
	
	static void printConstructorInfo(Constructor constructors[]) {
		for(Constructor c :constructors) {
				System.out.println("Constructor : " + c);
		}
	}
}
