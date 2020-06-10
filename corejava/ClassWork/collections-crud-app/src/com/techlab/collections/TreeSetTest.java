package com.techlab.collections;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> list=new TreeSet<String>();
		sc = new Scanner(System.in);
		w:while(true) {
			String data;
			System.out.println("\t1. Add \t2.Display \t3. Delete \t4. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("\tEnter data to add.");
				data=sc.next();
				list.add(data);
				break;
			case 2:
				for(String i:list) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("\tEnter data to delete");
				data=sc.next();
				list.remove(data);
				break;
			case 4:
				System.out.println("\tExitting");
				break w;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
