package com.techlab.board;

import com.techlab.player.IPlayerChoice;

public class Board implements IBoardDimension, IPlayerChoice {

	public int row;;
	public int column;;
	public Cell[][] cellBoard;
	private boolean canBoardDimensionsBeModified = true;
	private boolean boardCreated = false;
	private Cell lastCellMarked;

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setRow(int row) {
		if (canBoardDimensionsBeModified) {
			this.row = row;
		}
	}

	public void setColumn(int column) {
		if (canBoardDimensionsBeModified) {
			this.column = column;
		}
	}

	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		createBoard();
	}

	public Board() {
		this.row = height;
		this.column = width;
	}

	public void createBoard() {
		cellBoard = new Cell[row][column];
		canBoardDimensionsBeModified = false;
		boardCreated = true;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
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
		if (boardCreated) {
			return cellBoard;
		} else {
			throw new GameBoardNotCreated();
		}
	}

	public Cell getCell(int x, int y) {
		return cellBoard[x][y];
	}

	public mark getCellMark(int x, int y) {
		return cellBoard[x][y].getCellMark();
	}

	public void addMark(int x, int y, mark playermark) throws AlreadyMarkedException {

		if (!cellBoard[x][y].isMarked()) {
			cellBoard[x][y].setCellMark(playermark);
		} else {
			throw new AlreadyMarkedException();
		}

	}

	public boolean isCellEmpty(int x, int y) {
		if (cellBoard[x][y].isMarked()) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		for (Cell[] row : getCellBoard()) {
			for (Cell column : row) {
				// System.out.print(" " + column + " ");
				b.append(column);
			}
			// System.out.println();
			b.append("\n");
		}
		return b.toString();
	}

}
