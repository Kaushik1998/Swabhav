package com.techlab.game;

import java.util.Random;
import java.util.Scanner;

class PlayGame {
	void game() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int random = r.nextInt(10);
		int choice = 99;
		System.out.println("Enter a number between 0 - 9");
		while (true) {
			choice = sc.nextInt();
			if (choice == random) {
				System.out.println("You have guessed correct");
				break;
			} else if (choice > random) {
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

public class MenuDrivenGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    boolean flag = true;

		System.out.println(" 1. Start Game \n 2. Restart the game \n 3. Exit");
		PlayGame pg = new PlayGame();
		while (flag) {
			System.out.println("Enter your choice");
			int ch = s.nextInt();
			switch (ch) {
			case 1 :
				pg.game();
				break;
			case 2: 
				System.out.println("Would you like to play again ?");
				System. out. print("\033[H\033[2J");
				System. out. flush();
			    pg.game();
				break;
			case 3 :
				System.out.println("Game exitting");
				flag = false;
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}

}
