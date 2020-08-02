package com.techlab.pattern_analyzer;

import com.techlab.board.Board;
import com.techlab.board.IBoard;
import com.techlab.board.IBoardDimension;
import com.techlab.tictactoe.IPatternLength;

public class PatternAnalyzer implements IBoard, IPatternLength {
	private Board gameBoard = board;
	private int row;
	private int column;
	private boolean patternFound = false;
	private int matchCount = requiredPatternMatches;

	
	
	public int getMatchCount() {
		return matchCount;
	}


	public void setMatchCount(int matchCount) {
		this.matchCount = matchCount;
	}


	public PatternAnalyzer() {
		row = gameBoard.getRow();
		column = gameBoard.getColumn();
	}
		

	public PatternAnalyzer(Board gameBoard, int row, int column, boolean patternFound, int matchCount) {
		super();
		this.gameBoard = gameBoard;
		this.row = row;
		this.column = column;
		this.patternFound = patternFound;
		this.matchCount = matchCount;
	}



	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

	public void checkPattern(int x, int y) {
		if (!gameBoard.isCellEmpty(x, y)) {
			checkLeftDiagonal(x, y);
			checkRightDiagonal(x, y);
			checkVertical(x, y);
			checkHorizontal(x, y);
		}

	}

	public void checkLeftDiagonal(int x, int y) {
		int leftDiagonal = 1;
		int i = 1;
		up: while ((x - i) >= 0 && (y - i) >= 0) {
			if (gameBoard.getCellMark(x - i, y - i) == gameBoard.getCellMark(x, y)) {
				leftDiagonal++;
			} else {
				break up;
			}
			i++;
		}

		i = 1;
		down: while ((x + i) < row && (y + i) < column) {
			if (gameBoard.getCellMark(x + i, y + i) == gameBoard.getCellMark(x, y)) {
				leftDiagonal++;
			} else {
				break down;
			}
			i++;
		}

		if (leftDiagonal >= matchCount) {
			patternFound = true;
		}
	}

	public void checkRightDiagonal(int x, int y) {
		int rightDiagonal = 1;
		int i = 1;
		up: while ((x - i) >= 0 && (y + i) < column) {
			if (gameBoard.getCellMark(x - i, y + i) == gameBoard.getCellMark(x, y)) {
				rightDiagonal++;
			} else {
				break up;
			}
			i++;
		}
		i = 1;
		down: while ((x + i) < row && (y - i) >= 0) {
			if (gameBoard.getCellMark(x + i, y - i) == gameBoard.getCellMark(x, y)) {
				rightDiagonal++;
			} else {
				break down;
			}
			i++;
		}

		if (rightDiagonal >= matchCount) {
			patternFound = true;
		}
	}

	public void checkVertical(int x, int y) {
		int vertical = 1;
		int i = 1;

		up: while ((x - i) >= 0) {
			if (gameBoard.getCellMark(x - i, y) == gameBoard.getCellMark(x, y)) {
				vertical++;
			} else {
				break up;
			}
			i++;
		}
		i = 1;
		down: while ((x + i) < row) {
			if (gameBoard.getCellMark(x + i, y) == gameBoard.getCellMark(x, y)) {
				vertical++;
			} else {
				break down;
			}
			i++;
		}

		if (vertical >= matchCount) {
			patternFound = true;
		}

	}

	public void checkHorizontal(int x, int y) {
		int horizontal = 1;
		int i = 1;

		left: while ((y - i) >= 0) {
			if (gameBoard.getCellMark(x, y - i) == gameBoard.getCellMark(x, y)) {
				horizontal++;
			} else {
				break left;
			}
			i++;
		}

		i = 1;

		right: while ((y + i) < column) {
			if (gameBoard.getCellMark(x, y + i) == gameBoard.getCellMark(x, y)) {
				horizontal++;
			} else {
				break right;
			}
			i++;
		}

		if (horizontal >= matchCount) {
			patternFound = true;
		}
	}

	public boolean isPatternFound() {
		return patternFound;
	}
}
