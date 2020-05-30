package com.techlab.contact;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, String[]> phoneBook = new HashMap<>();

	public void addToContacts(String firstName, String lastName, String contactNo, String emailID) {
		String data[] = new String[3];
		data[0] = lastName;
		data[1] = contactNo;
		data[2] = emailID.concat("@gmail.com");
		phoneBook.put(firstName, data);
	}
	
	public void addToContacts(String firstName, String lastName, int contactNo, String emailID) {
		String data[] = new String[3];
		data[0] = lastName;
		data[1] = Integer.toString(contactNo);
		data[2] = emailID.concat("@gmail.com");
		phoneBook.put(firstName, data);
	}

	public String searchContactByName(String name) {
		String temp[] = phoneBook.get(name);
		return String.format("\nFirst Name : " + name + "\nLast Name : " + temp[0] + "\nContact No : " + temp[1]
				+ "\nEmail ID : " + temp[2]);
	}

	public void modifyContactByName(String firstName, String lastName, String contactNo, String emailID) {
		String data[] = new String[3];
		data[0] = lastName;
		data[1] = contactNo;
		data[2] = emailID;
		phoneBook.replace(firstName, data);
	}


	public void deleteContact(String firstName) {
		phoneBook.remove(firstName);
	}

	public Map<String, String[]> getPhoneBook() {
		return phoneBook;
	}

}
