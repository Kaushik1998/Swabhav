package com.techlab.reflection;

import java.lang.reflect.*;

import com.techlab.Person.Person;

public class ReflectionTest2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// Object obj=new Object();
		Person obj = new Person("Kaushik", "Male", 23f, 243f);
/*		printMethodInfo(obj);
		printGetterInfo(obj);
		printConstructorInfo(obj);*/
		printPrivateMethods(obj);

	}

	static void printMethodInfo(Object obj) {
		Method classMethods[] = obj.getClass().getMethods();
		for (Method method : classMethods) {
			System.out.println("Method : " + method.getName());
		}
	}

	static void printGetterInfo(Object obj) {
		Method classMethods[] = obj.getClass().getMethods();
		for (Method method : classMethods) {
			if (method.getName().startsWith("get")) {
				System.out.println("Getter Method : " + method.getName());
			}
		}
	}

	static void printSetterInfo(Object obj) {
		Method classMethods[] = obj.getClass().getMethods();
		for (Method method : classMethods) {
			if (method.getName().startsWith("set")) {
				System.out.println("Setter Method : " + method.getName());
			}
		}
	}

	static void printConstructorInfo(Object obj) {
		Constructor classMethods[] = obj.getClass().getConstructors();
		for (Constructor c : classMethods) {
			System.out.println("Constructor : " + c);
		}
	}

	static void printPrivateDataMembers(Object obj) throws NoSuchMethodException, SecurityException {
		Field [] privateArray=obj.getClass().getDeclaredFields();
		for(Field f: privateArray) {
			f.setAccessible(true);
			System.out.println(f.getName());
		}
	}
	
	static void printPrivateMethods(Object obj) {
		Method [] privateArray=obj.getClass().getDeclaredMethods();
		for(Method f: privateArray) {
			if(Modifier.isPrivate(f.getModifiers())) {
				f.setAccessible(true);
				System.out.println(f.getName());
			}
		}
	}
}
