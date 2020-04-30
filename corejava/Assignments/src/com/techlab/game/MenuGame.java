package com.techlab.game;

import java.util.Random;
import java.util.Scanner;

class PlayGame2 {
	void game() {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int random = r.nextInt(10);
		final int START_GAME = 1;
		final int RESTART_GAME = 2;
		final int END_GAME = 3;
		
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
		sc.close();
	}
}

public class MenuGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean flag = true;
		System.out.println(" 1. Start Game \n 2. Exit");
		int ch = s.nextInt();
		PlayGame2 pg = new PlayGame2();
		if (ch == 1) {
			do {
				pg.game();
				System.out.println(" 1. Restart the game \n 2. Exit");
				ch = s.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Game again");
					break;
				case 2:
					flag = false;
					System.out.println("Game exitting");
					break;
				default:
					System.out.println("Wrong choice");
					break;
				}
			} while (flag == true);
		} else {
			System.out.println("Game closed");
		}
		s.close();
	}

}
