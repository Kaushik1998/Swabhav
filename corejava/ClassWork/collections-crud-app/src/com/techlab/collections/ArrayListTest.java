package com.techlab.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		sc = new Scanner(System.in);
		w:while(true) {
			String data;
			System.out.println("1. Add 2.Display 3. Delete 4. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter data to add.");
				data=sc.next();
				list.add(data);
				break;
			case 2:
				for(String i:list) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("Enter index to delete");
				data=sc.next();
				list.remove(data);
				break;
			case 4:
				System.out.println("Exitting");
				break w;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
