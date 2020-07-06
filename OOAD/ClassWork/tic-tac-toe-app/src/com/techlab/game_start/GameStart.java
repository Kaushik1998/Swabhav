package com.techlab.game_start;

import java.util.Scanner;

import com.techlab.board.IBoard;
import com.techlab.player.Player;
import com.techlab.tictactoe.TicTacToe;

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
		while (!game.isWinnerDeclared()) {
			System.out.println("Enter " + game.getCurrentPlayerName() + " row");
			row = sc.nextInt();
			System.out.println("Enter " + game.getCurrentPlayerName() + " column");
			column = sc.nextInt();
			game.enterInput(row, column);
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
		}
	}

}
