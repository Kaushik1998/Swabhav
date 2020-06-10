package com.techlab.collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> list=new HashSet();
		w:while(true) {
			String data;
			System.out.println("1. Add 2.Display 3. Delete 4. Exit");
			int choice=new Scanner(System.in).nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter data to add.");
				data=new Scanner(System.in).next();
				list.add(data);
				break;
			case 2:
				for(String i:list) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("Enter data to delete");
				data=new Scanner(System.in).next();
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
