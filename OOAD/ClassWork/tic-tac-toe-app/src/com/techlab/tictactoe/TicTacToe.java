package com.techlab.tictactoe;

import com.techlab.board.AlreadyMarkedException;
import com.techlab.board.Cell;
import com.techlab.board.IBoard;
import com.techlab.board.analyzer.IBoardAnalyzer;
import com.techlab.player.IPlayerChoice;
import com.techlab.player.Player;

public class TicTacToe implements IPlayers, IBoard, IPlayerChoice, IBoardAnalyzer {
	private Player players[] = new Player[playerCount];
	private Player winnerPlayer;
	// private BoardAnalyzer ba = new BoardAnalyzer();
	private int playerPointer = 0;
	private boolean winnerDeclared = false;

	public TicTacToe() {
		mark[] choices = mark.values();
		for (int i = 0; i < playerCount; i++) {
			players[i] = new Player();
			players[i].setPlayerMark(choices[i]);
		}
	}

	public mark getCurrentPlayerMark() {
		return players[playerPointer].getPlayerMark();
	}

	public String getCurrentPlayerName() {
		return players[playerPointer].getPlayerName();
	}

	public Player[] getPlayers() {
		return players;
	}

	public void enterInput(int x, int y) {

		if (board.cellBoard[x][y].isMarked()) {
			throw new AlreadyMarkedException(x, y);
		} else {
			players[playerPointer].putMark(x - 1, y - 1);
			for (Cell[] row : board.getCellBoard()) {
				for (Cell column : row) {
					System.out.print(" " + column + " ");
				}
				System.out.println();
			}
			if (analyzer.checkPattern()) {
				winnerPlayer = players[playerPointer];
				winnerDeclared = true;
				// System.out.println("Pattern found");
			}
			updatePlayerPointer();
		}

	}

	public boolean isWinnerDeclared() {
		return winnerDeclared;
	}

	public Player getWinnerPlayer() {
		return winnerPlayer;
	}

	public void updatePlayerPointer() {
		if (playerPointer == playerCount - 1) {
			playerPointer = 0;
		} else {
			playerPointer++;
		}
	}

	/*
	 * public void askInputFromUser() { w: while (true) { for (Player p : players) {
	 * System.out.println(p + " Enter row"); int x = sc.nextInt();
	 * System.out.println(p + " Enter column"); int y = sc.nextInt(); p.putMark(x -
	 * 1, y - 1); for (Cell[] row : board.getCellBoard()) { for (Cell column : row)
	 * { System.out.print(" " + column + " "); } System.out.println(); } if
	 * (ba.checkPattern()) { System.out.println("Pattern found"); break w; } } } }
	 */
}
