package com.techlab.game_start;

import java.util.Scanner;

<<<<<<< HEAD
import com.techlab.board.AlreadyMarkedException;
=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
import com.techlab.board.IBoard;
import com.techlab.player.Player;
import com.techlab.tictactoe.TicTacToe;

<<<<<<< HEAD
public class GameStart implements IBoard {
	static TicTacToe game;
	private static Scanner sc;

	public static void main(String[] args) throws AlreadyMarkedException,ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		game = new TicTacToe();
		game.setRow(5);
		game.setColumn(5);
		game.startGame();
		int row;
		int column;
		sc = new Scanner(System.in);
=======
public class GameStart implements IBoard{
	static TicTacToe game;
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new TicTacToe();
		int row;
		int column;
		sc = new Scanner(System.in);
		askPlayerName();
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
		while (!game.isWinnerDeclared()) {
			System.out.println("Enter " + game.getCurrentPlayerName() + " row");
			row = sc.nextInt();
			System.out.println("Enter " + game.getCurrentPlayerName() + " column");
			column = sc.nextInt();
			game.enterInput(row, column);
<<<<<<< HEAD
			System.out.println(game.displayBoard());
		}

		if (game.isWinnerDeclared()) {
			System.out.println(game.getWinnerPlayer() + " has won");
			System.out.println(game.getCurrentPlayer() + " has lost");
=======
		}

		if (game.isWinnerDeclared()) {
			System.out.println(game.getCurrentPlayerName() + " has lost");
		}
	}

	private static void askPlayerName() {
		// TODO Auto-generated method stub
		for (Player p : game.getPlayers()) {
			System.out.println("Enter Player Name");
			String name = sc.next();
			p.setPlayerName(name);
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
		}
	}

}
