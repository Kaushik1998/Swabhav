package com.techlab.shopping_cart;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.techlab.customer.Customer;
import com.techlab.product.Apple;
import com.techlab.product.Banana;
import com.techlab.product.Mango;
import com.techlab.serialize.Serialize;

public class ShoppingCart {
	private static Scanner sc;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		sc = new Scanner(System.in);
		Serialize s = new Serialize();
		w: while (true) {
			System.out.println("\t1. Get a new Cart \t2. Open existing Cart \t3.Delete Cart \t4. Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name");
				String name = sc.next();
				System.out.println("Enter Address");
				String address = sc.next();
				Customer customer = new Customer(name, address);
				run(customer);
				s.writeFileData(customer, name);
				break;
			case 2:
				displayFileData();
				String fileName = sc.next();
				Customer existingCustomer = (Customer) s.getFileData(fileName);
				run(existingCustomer);
				s.writeFileData(existingCustomer, existingCustomer.getCustomerName());
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
				System.out.println("Enter again");
				break;
			}
		}
	}

	static void displayFileData() {
		File directoryPath = new File(
				"D:\\Swabhav\\\\OOAD\\Assignment\\shopping-cart-app\\src\\\\com\\techlab\\Resources\\");
		String contents[] = directoryPath.list();
		System.out.println("List of files and directories in the specified directory:");
		for (int i = 0; i < contents.length; i++) {
			if (contents[i].endsWith(".txt")) {
				System.out.println(contents[i]);
			}
		}
	}

	static void run(Customer c) {
		outer: while (true) {
			System.out.println("\t1.Add products \t 2.Remove products \t3.Display details \t4.Exit");
			int get = sc.nextInt();
			switch (get) {
			case 1:
				w: while (true) {
					System.out.println("\t1.Apple \t2.Mango \t3.Banana \t4.Exit");
					int choice = sc.nextInt();
					int quantity;
					switch (choice) {
					case 1:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.add(new Apple(), quantity);
						break;
					case 2:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.add(new Mango(), quantity);
						break;
					case 3:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.add(new Banana(), quantity);
						break;
					case 4:
						System.out.println("Items added to Cart");
						break w;
					default:
						System.out.println("Enter correct product");
					}
				}
				break;
				
			case 2:
				w: while (true) {
					System.out.println("\t1.Apple \t2.Mango \t3.Banana \t4.Exit");
					int choice = sc.nextInt();
					int quantity;
					switch (choice) {
					case 1:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.remove(new Apple(), quantity);
						break;
					case 2:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.remove(new Mango(), quantity);
						break;
					case 3:
						System.out.println("Enter Quantity");
						quantity = sc.nextInt();
						c.remove(new Banana(), quantity);
						break;
					case 4:
						System.out.println("Items added to Cart");
						break w;
					default:
						System.out.println("Enter correct product");
					}
				}
				break;
				
			case 3:
				System.out.println(c);
				break;
			case 4:
				System.out.println("Exit Cart");
				break outer;
			}
		}
	}
}
