package com.techlab.contact.test;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import com.techlab.contact.Contact;

public class ContactOperations {

	private static Scanner sc;

	public void run(Contact c) throws IOException {
		// TODO Auto-generated method stub
		int choice;
		boolean flag = true;
		sc = new Scanner(System.in);

		while (flag) {
			System.out.println("1.Add \t2.Modify \t3.Display \t4.Delete \t5.Search \t6.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				case1(c);
				break;
			case 2:
				case2(c);
				break;
			case 3:
				case3(c.getPhoneBook());
				break;
			case 4:
				case4(c);
				break;
			case 5:
				case5(c);
				break;
			case 6:
				System.out.println("Exitting");
				flag = false;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	static void case1(Contact c) {
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		System.out.println("Enter Contact Number : ");
		String contactNo = sc.next();
		System.out.println("Enter Email ID : ");
		String emailID = sc.next();
		c.addToContacts(firstName, lastName, contactNo, emailID);
	}

	static void case2(Contact c) {
		System.out.println("Enter First Name : ");
		String firstName = sc.next();
		System.out.println("Enter Last Name : ");
		String lastName = sc.next();
		System.out.println("Enter Contact Number : ");
		String contactNo = sc.next();
		System.out.println("Enter Email ID : ");
		String emailID = sc.next();
		c.modifyContactByName(firstName, lastName, contactNo, emailID);
		
/*
		static void validateContact(String contact) {
			long number=Integer.parseInt(contact);
			w : while(true) {
				if(number>9999999999||number<1000000000)
				{
					System.out.println("Wrong number");
				}
				else {
					break w;
				}
			}
		}
*/
	}

	static void case3(Map<String, String[]> phoneBook) {
		Set<String> keys = phoneBook.keySet();
		for (String i : keys) {
			System.out.print(" : " + i + " : ");
			for (String j : phoneBook.get(i)) {
				System.out.print(j + " : ");
			}
			System.out.println();
		}
	}

	static void case4(Contact c) {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		c.deleteContact(firstName);
	}

	static void case5(Contact c) {
		System.out.println("Enter Name ");
		String name = sc.next();
		System.out.println(c.searchContactByName(name));
	}
}
