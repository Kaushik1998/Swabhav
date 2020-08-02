package com.techlab.game_start;

import java.util.Scanner;

import com.techlab.board.AlreadyMarkedException;
import com.techlab.board.IBoard;
import com.techlab.tictactoe.Game;

public class GameStart implements IBoard {
	static Game game;
	private static Scanner sc;

	public static void main(String[] args) throws AlreadyMarkedException,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		game = new Game();
		game.setRow(3);
		game.setColumn(3);
		game.startGame();
		int row;
		int column;
		sc = new Scanner(System.in);
		while (!game.isWinnerDeclared()) {
			System.out.println("Enter " + game.getCurrentPlayerName() + " row");
			row = sc.nextInt();
			System.out.println("Enter " + game.getCurrentPlayerName() + " column");
			column = sc.nextInt();
			game.enterInput(row, column);
			System.out.println(game.getFullBoard());
		}

		if (game.isWinnerDeclared()) {
			System.out.println(game.getWinnerPlayer() + " has won");
			System.out.println(game.getCurrentPlayer() + " has lost");
		}
	}

}
