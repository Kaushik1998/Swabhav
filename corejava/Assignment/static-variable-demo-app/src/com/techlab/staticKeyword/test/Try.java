package com.techlab.staticKeyword.test;

import java.io.IOException;import java.util.Scanner;


public class Try {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		w: while (true) {
			System.out.println("1. Take new cart \t 2. Get existing cart. \t 3. Delete carts \t 4. Exit");
			String choice = sc.next();
			switch(choice) {
			case "1":
				System.out.println("Enter filename");
				String fileName=sc.next();
				System.out.println(fileName);
				break;
			case "4":
				System.out.println("Exit App");
				break w;
			default:
				System.out.println("Wrong Choice");
				break;
			}
		}
	}

}