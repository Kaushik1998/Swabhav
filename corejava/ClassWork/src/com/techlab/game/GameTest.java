package com.techlab.game;

import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int random = r.nextInt(10);
		int choice=99;
		System.out.println("Enter a number between 0 - 9");
		while (true)
		{
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			if (choice == random) {
				System.out.println("You have guessed correct");
				break;
			}
			else if (choice > random){
				System.out.println("Try lower");
				continue;
			}
			
			else if (choice < random) {
				System.out.println("Try Higher");
				continue;
			}
		}
	}

}
