package com.techlab.tictactoe;

import java.util.Scanner;

public class Test {
	private static Scanner sc;

	public static void main(String[] args) {
		TicTacToe tt = new TicTacToe();
		sc = new Scanner(System.in);
		int x, y;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter X");
			x = sc.nextInt();
			System.out.println("Enter Y");
			y = sc.nextInt();
			if (x < 3 + 1 && y < 3 + 1) {
				tt.enterInput(x, y);
			} else {
				System.out.println("Enter again");
			}
		}
	}
}
