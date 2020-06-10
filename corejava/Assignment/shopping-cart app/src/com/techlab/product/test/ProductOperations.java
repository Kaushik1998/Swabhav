package com.techlab.product.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.techlab.product.Product;

public class ProductOperations {

	public static void  main(String args[]) throws IOException {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			Product p =new Product();
			w: while (true) {
				System.out.println("\t1.Add \t2.Search \t3.Delete \t4.Total \t5.Display \t6.Exit");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("\t1.Apple : 10 \t2.Orange : 20 \t3.Banana : 30");
					int addChoice = sc.nextInt();
					System.out.println("Enter Quantity : \t\t( Enter Negative number to reduce item count )");
					int unitCount = sc.nextInt();
					p.add(addChoice, unitCount);
					break;
				case 2:
					System.out.println("Enter Product name to search : ");
					String searchData = sc.next();
					System.out.println(p.search(searchData));
					break;
				case 3:
					System.out.println("Enter Product name to delete");
					String deleteData = sc.next();
					p.deleteFromCart(deleteData);
					break;
				case 4:
					System.out.println("Total Value : " + p.getTotal());
					break;
				case 5:
					Map<String, Integer> cart = p.getCart();
					for (String i : cart.keySet()) {
						System.out.println("\tUnit : " + i + "\tQuantity : " + cart.get(i));
					}
					break;
				case 6:
					System.out.print("Exitting");
					System.out.println("Enter file Name");
					String fileName = sc.next();
					writeFileData(p,fileName);
					break w;
				}
			}
		}
	}
	static void writeFileData(Product c, String name) throws IOException {
		String fileName = name.concat(".txt");
		FileOutputStream fout = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(c);
		out.flush();
		out.close();
	}

}
