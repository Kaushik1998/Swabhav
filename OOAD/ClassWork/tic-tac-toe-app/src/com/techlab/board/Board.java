package com.techlab.board;

import com.techlab.player.IPlayerChoice;

public class Board implements IBoardDimension, IPlayerChoice {

	public Cell[][] cellBoard = new Cell[height][width];

	public Board() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				cellBoard[i][j] = new Cell();
			}
		}
	}

	public boolean isFull() {
		for (Cell[] row : cellBoard) {
			for (Cell cell : row) {
				if (!cell.isMarked()) {
					return false;
				}
			}
		}
		return true;
	}

	public Cell[][] getCellBoard() {
		return cellBoard;
	}

	public void addMark(int x, int y, mark playermark) {

		try {
			if (!cellBoard[x][y].isMarked()) {
				cellBoard[x][y].setCellMark(playermark);
			} else {
				throw new AlreadyMarkedException("Cell".concat(String.valueOf(x)).concat(String.valueOf(y)));
			}
		} catch (AlreadyMarkedException e) {
			e.printStackTrace();
		}
	}

	public boolean isCellEmpty(int x, int y) {
		if (cellBoard[x][y].isMarked()) {
			return false;
		}
		return true;
	}
}
