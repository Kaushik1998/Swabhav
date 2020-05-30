package com.techlab.contact.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.techlab.contact.Contact;

public class ContactAppUI {

	private static Scanner sc;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ContactOperations contactOperation = new ContactOperations();
		boolean flag = true;
		System.out.println("\n\t--------------------------WELCOME--------------------------\n");
		sc = new Scanner(System.in);
		w: while (flag) {
			System.out.println("1. Create new List \t 2. Load existing list. \t 3. Delete Lists");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Contact c = new Contact();
				contactOperation.run(c);
				System.out.println("Enter the filename");
				String name = sc.next();
				writeFileData(c, name);
				break;
			case 2:
				displayFileData();
				System.out.println("Enter filename you want to open");
				String fileName = sc.next();
				contactOperation.run(getFileData(fileName));
				break;

			case 3:
				displayFileData();
				System.out.println("Enter filename to delete");
				String deleteFileName = sc.next().concat(".txt");
				new File(deleteFileName).delete();
				break;
			case 4:
				System.out.println("App Closed");
				break w;
			default:
				System.out.println("Default");
				break;
			}
		}
	}

	static void displayFileData() {
		File directoryPath = new File("D:\\Swabhav\\corejava\\Assignment\\contact-app");
		String contents[] = directoryPath.list();
		System.out.println("List of files and directories in the specified directory:");
		for (int i = 0; i < contents.length; i++) {
			if (contents[i].endsWith(".txt")) {
				System.out.println(contents[i]);
			}
		}
	}

	static void writeFileData(Contact c, String name) throws IOException {
		String fileName = name.concat(".txt");
		FileOutputStream fout = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(c);
		out.flush();
		out.close();
	}

	static Contact getFileData(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		fileName = fileName.concat(".txt");
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Contact s = (Contact) in.readObject();
		in.close();
		return s;
	}
}
