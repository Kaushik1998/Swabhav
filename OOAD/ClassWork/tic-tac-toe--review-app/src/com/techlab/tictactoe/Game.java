package com.techlab.tictactoe;

import com.techlab.board.AlreadyMarkedException;
import com.techlab.board.Board;
import com.techlab.board.Cell;
import com.techlab.board.IBoard;
import com.techlab.pattern_analyzer.IPatternAnalyzer;
import com.techlab.pattern_analyzer.PatternAnalyzer;
import com.techlab.player.IPlayerChoice;
import com.techlab.player.Player;

public class Game implements IPlayers, IBoard, IPlayerChoice, IPatternAnalyzer, IPatternLength {
	private Player players[];
	private int playersCount = playerCount;
	private Player winnerPlayer;
	private Board gameBoard = board;
	private int patternLengthRequired = 3;
	private PatternAnalyzer patternAnalyzer;
	private int playerPointer = 0;
	private boolean winnerDeclared = false;

	private GameDetails gameDetails;

	public Game() {
		gameDetails = new GameDetails();
		gameDetails.setGameBoard(gameBoard);
	}

	public void startGame() {
		// gameDetails.setGameBoard(gameBoard);
		players = new Player[playersCount];
		patternAnalyzer = analyzer;
		patternAnalyzer.setGameBoard(gameBoard);
		analyzer.setMatchCount(patternLengthRequired);
		gameBoard.createBoard();
		setPlayerMarks();
	}

	public void setPlayerMarks() {
		mark[] choices = mark.values();
		for (int i = 0; i < playersCount; i++) {
			players[i] = new Player();
			players[i].setPlayerName("Player " + i);
			players[i].setPlayerMark(choices[i]);
		}
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

	public mark getCurrentPlayerMark() {
		return players[playerPointer].getPlayerMark();
	}

	public String getCurrentPlayerName() {
		return players[playerPointer].getPlayerName();
	}

	public Player[] getPlayers() {
		return players;
	}

	public Player getCurrentPlayer() {
		return players[playerPointer];
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
	}

	public boolean isWinnerDeclared() {
		return winnerDeclared;
	}

	public Player getWinnerPlayer() {
		return winnerPlayer;
	}

	public void updatePlayerPointer() {
		if (playerPointer == playersCount - 1) {
			playerPointer = 0;
		} else {
			playerPointer++;
		}
	}

	public StringBuffer getFullBoard() {
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

	public boolean equals(Object obj) {
		return winnerPlayer.equals(obj);
	}

	public String toString() {
		return winnerPlayer.toString();
	}

	public String getPlayerName() {
		return winnerPlayer.getPlayerName();
	}

	public mark getPlayerMark() {
		return winnerPlayer.getPlayerMark();
	}

	public int hashCode() {
		return winnerPlayer.hashCode();
	}

	public void setPlayerName(String playerName) {
		winnerPlayer.setPlayerName(playerName);
	}

	public void setPlayerMark(mark playerMark) {
		winnerPlayer.setPlayerMark(playerMark);
	}

	public void setGameBoard(Board gameBoard) {
		gameDetails.setGameBoard(gameBoard);
	}

	public void setRow(int row) {
		gameDetails.setRow(row);
	}

	public void setColumn(int column) {
		gameDetails.setColumn(column);
	}

	public int getRow() {
		return gameDetails.getRow();
	}

	public int getColumn() {
		return gameDetails.getColumn();
	}

	public int getPlayerCount() {
		return gameDetails.getPlayerCount();
	}

	public Cell getCell(int x, int y) {
		return gameDetails.getCell(x, y);
	}

	public mark getCellMark(int x, int y) {
		return gameDetails.getCellMark(x, y);
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
