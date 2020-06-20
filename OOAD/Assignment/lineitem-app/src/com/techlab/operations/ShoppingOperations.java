package com.techlab.operations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.techlab.order.Order;
import com.techlab.product.Product;
import com.techlab.product.Product.menu;

public class ShoppingOperations {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Product mobile = null, laptop = null, computer = null, tv = null;
		Order order;
		Set<Product> products = new HashSet<Product>();
		int count;
		while (true) {
			System.out.println("\t1.Buy \t2.Change Quantity \t3.Display \t4.Remove \t5.Place Order \t6.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1.Mobile 2.Computer 3.Laptop 4.TV");
				int product = sc.nextInt();
				switch (product) {
				case 1:
					System.out.println("Enter Count");
					count = sc.nextInt();
					mobile = new Product(menu.mobile);
					mobile.setCount(count);
					products.add(mobile);
					break;
				case 2:
					System.out.println("Enter Count");
					count = sc.nextInt();
					computer = new Product(menu.computer, count);
					products.add(computer);
					break;
				case 3:
					System.out.println("Enter Count");
					count = sc.nextInt();
					laptop = new Product(menu.laptop, count);
					products.add(laptop);
					break;
				case 4:
					System.out.println("Enter Count");
					count = sc.nextInt();
					tv = new Product(menu.tv, count);
					products.add(tv);
					break;
				default:
					System.out.println("wrong product");
					break;
				}
				break;

			case 2:
				System.out.println("1.Mobile 2.Computer 3.Laptop 4.TV");
				int quantity = sc.nextInt();
				switch (quantity) {
				case 1:
					System.out.println("Enter Count");
					count = sc.nextInt();
					mobile.setCount(count);
					break;
				case 2:
					System.out.println("Enter Count");
					count = sc.nextInt();
					computer.setCount(count);
					break;
				case 3:
					System.out.println("Enter Count");
					count = sc.nextInt();
					laptop.setCount(count);
					break;
				case 4:
					System.out.println("Enter Count");
					count = sc.nextInt();
					tv.setCount(count);
					break;
				default:
					System.out.println("wrong product");
					break;
				}
				break;

			case 3:
				for (Product p : products) {
					System.out.println(p);
				}
				break;
				
			case 4:
				int index = 0;
				for (Product p : products) {
					System.out.print(index + " : ");
					System.out.println(p);
					index++;
				}
				System.out.println("Enter product to remove ");
				String remove = sc.next();
				products.remove(remove);
				break;
				
			case 5:
				ArrayList<Product> orders=new ArrayList<Product>(products);
				order=new Order(orders);
				System.out.println(order);
				break;
				
			}
		}
	}
}
