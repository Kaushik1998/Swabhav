package com.techlab.tictactoe;

import com.techlab.board.AlreadyMarkedException;
<<<<<<< HEAD
import com.techlab.board.Board;
import com.techlab.board.Cell;
import com.techlab.board.IBoard;
import com.techlab.pattern_analyzer.IPatternAnalyzer;
import com.techlab.pattern_analyzer.PatternAnalyzer;
import com.techlab.player.IPlayerChoice;
import com.techlab.player.Player;

public class TicTacToe implements IPlayers, IBoard, IPlayerChoice, IPatternAnalyzer, IPatternLength {
	private Player players[];
	private int playersCount = playerCount;
	private Player winnerPlayer;
	private Board gameBoard = board;
	private int patternLengthRequired = 3;
	private PatternAnalyzer patternAnalyzer;
	private int playerPointer = 0;
	private boolean winnerDeclared = false;

	public void startGame() {
		players = new Player[playersCount];
		patternAnalyzer = analyzer;
		patternAnalyzer.setGameBoard(gameBoard);
		analyzer.setMatchCount(patternLengthRequired);
		gameBoard.createBoard();

		mark[] choices = mark.values();
		for (int i = 0; i < playersCount; i++) {
			players[i] = new Player();
			players[i].setPlayerName("Player " + i);
=======
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
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
			players[i].setPlayerMark(choices[i]);
		}
	}

<<<<<<< HEAD
	public void setRow(int row) {
		gameBoard.setRow(row);
	}

	public void setColumn(int column) {
		gameBoard.setColumn(column);
	}

	public int getRow() {
		return gameBoard.getRow();
	}

	public int getColumn() {
		return gameBoard.getColumn();
	}

	public int getPlayerCount() {
		return playersCount;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public void setPlayerCount(int playersNumber) {
		this.playersCount = playersNumber;
	}

	public void setPatternAnalyzer(PatternAnalyzer patternAnalyzer) {
		this.patternAnalyzer = patternAnalyzer;
	}

=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
	public mark getCurrentPlayerMark() {
		return players[playerPointer].getPlayerMark();
	}

	public String getCurrentPlayerName() {
		return players[playerPointer].getPlayerName();
	}

	public Player[] getPlayers() {
		return players;
	}

<<<<<<< HEAD
	public Player getCurrentPlayer() {
		return players[playerPointer];
	}

	public Cell getCell(int x, int y) {
		return gameBoard.getCell(x, y);
	}

	public mark getCellMark(int x, int y) {
		return getCell(x, y).getCellMark();
	}

	public void enterInput(int x, int y) throws AlreadyMarkedException, ArrayIndexOutOfBoundsException {

		if (!gameBoard.isCellEmpty(x, y)) {
			throw new AlreadyMarkedException(x, y);
		} else {
			players[playerPointer].putMark(x, y);
			patternAnalyzer.checkPattern(x, y);
			if (patternAnalyzer.isPatternFound()) {
				winnerPlayer = players[playerPointer];
				winnerDeclared = true;
			}
			updatePlayerPointer();
		}
=======
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

>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
	}

	public boolean isWinnerDeclared() {
		return winnerDeclared;
	}

	public Player getWinnerPlayer() {
		return winnerPlayer;
	}

	public void updatePlayerPointer() {
<<<<<<< HEAD
		if (playerPointer == playersCount - 1) {
=======
		if (playerPointer == playerCount - 1) {
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
			playerPointer = 0;
		} else {
			playerPointer++;
		}
	}

<<<<<<< HEAD
	public StringBuffer displayBoard() {
		StringBuffer b = new StringBuffer();
		for (Cell[] row : gameBoard.getCellBoard()) {
			for (Cell column : row) {
				// System.out.print(" " + column + " ");
				b.append(column);
			}
			// System.out.println();
			b.append("\n");
		}
		return b;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
	/*
	 * public void askInputFromUser() { w: while (true) { for (Player p : players) {
	 * System.out.println(p + " Enter row"); int x = sc.nextInt();
	 * System.out.println(p + " Enter column"); int y = sc.nextInt(); p.putMark(x -
	 * 1, y - 1); for (Cell[] row : board.getCellBoard()) { for (Cell column : row)
	 * { System.out.print(" " + column + " "); } System.out.println(); } if
	 * (ba.checkPattern()) { System.out.println("Pattern found"); break w; } } } }
	 */
}
