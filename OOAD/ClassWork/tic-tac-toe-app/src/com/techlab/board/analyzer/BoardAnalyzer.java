package com.techlab.board.analyzer;

<<<<<<< HEAD
import com.techlab.board.Board;
=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
import com.techlab.board.IBoard;
import com.techlab.board.IBoardDimension;

public class BoardAnalyzer implements IBoard, IBoardDimension {
	// private boolean gameOver = false;
	private boolean patternFound = false;
<<<<<<< HEAD
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
=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a

	public boolean checkPattern() {
		checkLeftDiagonal();
		checkRightDiagonal();
		checkVertical();
		checkHorizontal();
		return patternFound;
	}

	public void checkLeftDiagonal() {
<<<<<<< HEAD
		if (gameBoard.cellBoard[0][0].isMarked()) {
			if (gameBoard.cellBoard[0][0].getCellMark() == gameBoard.cellBoard[1][1].getCellMark()
					&& gameBoard.cellBoard[0][0].getCellMark() == gameBoard.cellBoard[2][2].getCellMark()) {
=======
		if (board.cellBoard[0][0].isMarked()) {
			if (board.cellBoard[0][0].getCellMark() == board.cellBoard[1][1].getCellMark()
					&& board.cellBoard[0][0].getCellMark() == board.cellBoard[2][2].getCellMark()) {
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
				patternFound = true;
			}
		}
	}

	public void checkRightDiagonal() {
<<<<<<< HEAD
		if (gameBoard.cellBoard[0][2].isMarked()) {
			if (gameBoard.cellBoard[0][2].getCellMark() == gameBoard.cellBoard[1][1].getCellMark()
					&& gameBoard.cellBoard[0][2].getCellMark() == gameBoard.cellBoard[2][0].getCellMark()) {
=======
		if (board.cellBoard[0][2].isMarked()) {
			if (board.cellBoard[0][2].getCellMark() == board.cellBoard[1][1].getCellMark()
					&& board.cellBoard[0][2].getCellMark() == board.cellBoard[2][0].getCellMark()) {
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
				patternFound = true;
			}
		}
	}

	public void checkVertical() {
		for (int i = 0; i < 3; i++) {
<<<<<<< HEAD
			if (gameBoard.cellBoard[0][i].isMarked()) {
				if (gameBoard.cellBoard[0][i].getCellMark() == gameBoard.cellBoard[1][i].getCellMark()
						&& gameBoard.cellBoard[0][i].getCellMark() == gameBoard.cellBoard[2][i].getCellMark()) {
=======
			if (board.cellBoard[0][i].isMarked()) {
				if (board.cellBoard[0][i].getCellMark() == board.cellBoard[1][i].getCellMark()
						&& board.cellBoard[0][i].getCellMark() == board.cellBoard[2][i].getCellMark()) {
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
					patternFound = true;
					return;
				}
			}
		}
	}

	public void checkHorizontal() {
		for (int i = 0; i < 3; i++) {
<<<<<<< HEAD
			if (gameBoard.cellBoard[i][0].isMarked()) {
				if (gameBoard.cellBoard[i][0].getCellMark() == gameBoard.cellBoard[i][1].getCellMark()
						&& gameBoard.cellBoard[i][0].getCellMark() == gameBoard.cellBoard[i][2].getCellMark()) {
=======
			if (board.cellBoard[i][0].isMarked()) {
				if (board.cellBoard[i][0].getCellMark() == board.cellBoard[i][1].getCellMark()
						&& board.cellBoard[i][0].getCellMark() == board.cellBoard[i][2].getCellMark()) {
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
					patternFound = true;
					return;
				}
			}
		}
	}
}
