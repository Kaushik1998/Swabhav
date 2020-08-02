package com.techlab.board.analyzer;

import com.techlab.board.Board;
import com.techlab.board.IBoard;
import com.techlab.board.IBoardDimension;

public class BoardAnalyzer implements IBoard, IBoardDimension {
	// private boolean gameOver = false;
	private boolean patternFound = false;
	//private boolean gameDraw = false;
	private Board gameBoard = board;

	public boolean isPatternFound() {
		return patternFound;
	}

	public Board getGameBoard() {
		return gameBoard;
	}

	public void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}

	public boolean checkPattern() {
		checkLeftDiagonal();
		checkRightDiagonal();
		checkVertical();
		checkHorizontal();
		return patternFound;
	}

	public void checkLeftDiagonal() {
		if (gameBoard.cellBoard[0][0].isMarked()) {
			if (gameBoard.cellBoard[0][0].getCellMark() == gameBoard.cellBoard[1][1].getCellMark()
					&& gameBoard.cellBoard[0][0].getCellMark() == gameBoard.cellBoard[2][2].getCellMark()) {
				patternFound = true;
			}
		}
	}

	public void checkRightDiagonal() {
		if (gameBoard.cellBoard[0][2].isMarked()) {
			if (gameBoard.cellBoard[0][2].getCellMark() == gameBoard.cellBoard[1][1].getCellMark()
					&& gameBoard.cellBoard[0][2].getCellMark() == gameBoard.cellBoard[2][0].getCellMark()) {
				patternFound = true;
			}
		}
	}

	public void checkVertical() {
		for (int i = 0; i < 3; i++) {
			if (gameBoard.cellBoard[0][i].isMarked()) {
				if (gameBoard.cellBoard[0][i].getCellMark() == gameBoard.cellBoard[1][i].getCellMark()
						&& gameBoard.cellBoard[0][i].getCellMark() == gameBoard.cellBoard[2][i].getCellMark()) {
					patternFound = true;
					return;
				}
			}
		}
	}

	public void checkHorizontal() {
		for (int i = 0; i < 3; i++) {
			if (gameBoard.cellBoard[i][0].isMarked()) {
				if (gameBoard.cellBoard[i][0].getCellMark() == gameBoard.cellBoard[i][1].getCellMark()
						&& gameBoard.cellBoard[i][0].getCellMark() == gameBoard.cellBoard[i][2].getCellMark()) {
					patternFound = true;
					return;
				}
			}
		}
	}
}
