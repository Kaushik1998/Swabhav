package com.techlab.tictactoe;

import com.techlab.board.Board;
import com.techlab.board.Cell;
import com.techlab.player.IPlayerChoice.mark;

public class GameDetails {
	
	private Board gameBoard;
	private int playersCount;

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

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

	public Cell getCell(int x, int y) {
		return gameBoard.getCell(x, y);
	}

	public mark getCellMark(int x, int y) {
		return getCell(x, y).getCellMark();
	}
		
}
