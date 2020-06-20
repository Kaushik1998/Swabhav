package com.techlab.contact.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.techlab.contact.Contact;

class ContactOperationsTest {
	Contact c = new Contact();

	@Test
	void testCase1() {
		String firstName = "Kaushik";
		String lastName = "Nippanikar";
		String contactNo = "8779395779";
		String emailID = "nippanikarkaushik";
		String expectedEmailID = "nippanikarkaushik@gmail.com";

		Map<String, String[]> phoneBook = c.getPhoneBook();

		c.addToContacts(firstName, lastName, contactNo, emailID);
		String values[] = phoneBook.get(firstName);

		assertEquals(true, phoneBook.containsKey(firstName));
		assertEquals(lastName, values[0]);
		assertEquals(contactNo, values[1]);
		assertEquals(expectedEmailID, values[2]);
	}

	@Test
	void testCase2() {
		String firstName = "Kaushik";
		String newLastName = "Nippanikar2";
		String newContactNo = "87793957792";
		String newEmailID = "nippanikarkaushik2";
		String expectedEmailID = "nippanikarkaushik2@gmail.com";

		Map<String, String[]> phoneBook = c.getPhoneBook();

		c.addToContacts(firstName, newLastName, newContactNo, newEmailID);
		String values[] = phoneBook.get(firstName);

		assertEquals(true, phoneBook.containsKey(firstName));
		assertEquals(newLastName, values[0]);
		assertEquals(newContactNo, values[1]);
		assertEquals(expectedEmailID, values[2]);
	}

	@Test
	void testCase4() {
		String firstName = "Kaushik";
		c.deleteContact(firstName);
		Map<String, String[]> phoneBook = c.getPhoneBook();

		assertEquals(false, phoneBook.containsKey(firstName));

	}

	@Test
	void testCase5() {
		String firstName = "Kaushik";
		c.deleteContact(firstName);
		Map<String, String[]> phoneBook = c.getPhoneBook();

		assertEquals(false, phoneBook.containsKey(firstName));
	}
}