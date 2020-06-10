package com.techlab.collections;

import java.util.*; 

public class LinkedHashMapTest {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> list=new LinkedHashMap<String,String>();  
		sc = new Scanner(System.in);
		w:while(true) {
			String data;
			System.out.println("\t1. Add \t2.Display \t3. Delete \t4. Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("\tEnter Key to add.");
				String key =sc.next();
				System.out.println("\tEnter Value to add");
				String value =sc.next();
				list.put(key,value);
				break;
			case 2:
				for(Map.Entry m:list.entrySet()){    
			           System.out.println(m.getKey()+" "+m.getValue());    
			          }  
				break;
			case 3:
				System.out.println("\tEnter Key to delete");
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
