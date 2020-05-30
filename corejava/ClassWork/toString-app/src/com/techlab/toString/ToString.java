package com.techlab.toString;

public class ToString {
	private String name;
	private String surname;
	
	public ToString(String name,String surname) {
		this.name=name;
		this.surname=surname;
	}
	
	@Override
	public String toString() {
		return String.format(name+" "+surname);
	}
}
