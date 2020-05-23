package com.techlab.person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	protected int id;
	protected String address;
	protected Date birthDate;
	protected String name;

	public Person(String name, int id, String address, String birthDate) throws ParseException {
		this.name = name;
		this.id = id;
		this.address = address;
		setDate(birthDate);
	}

	public void setDate(String date) throws ParseException {
		this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}

	protected Date getDate() {
		return birthDate;
	}

	protected String getAddress() {
		return address;
	}

	protected String getName() {
		return name;
	}
	
	protected int getID() {
		return id;
	}
}
