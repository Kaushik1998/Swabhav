package com.techlab.reflection;
class Simple{} 
public class Reflection {
	public static void main(String args[]) throws ClassNotFoundException{  
		  Class c=Class.forName("Simple");  
		  System.out.println(c.getName());  
		 }  
}
