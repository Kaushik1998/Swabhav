package com.techlab.foo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Foo {
	
	@RequireRefactor
	public void go() {
		System.out.println("Pehli fursat me nikal");
	}

	public void greet() {
		System.out.println("Greet");
	}

	public void play() {
		System.out.println("play");
	}
	@RequireRefactor
	public void dance() {
		System.out.println("Nacho");
	}
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public
	@interface RequireRefactor{
		
	}
}
