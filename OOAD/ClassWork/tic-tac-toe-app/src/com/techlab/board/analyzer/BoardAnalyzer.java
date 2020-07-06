package com.techlab.board.analyzer;

import com.techlab.board.IBoard;
import com.techlab.board.IBoardDimension;

public class BoardAnalyzer implements IBoard, IBoardDimension {
	// private boolean gameOver = false;
	private boolean patternFound = false;

	public boolean checkPattern() {
		checkLeftDiagonal();
		checkRightDiagonal();
		checkVertical();
		checkHorizontal();
		return patternFound;
	}

	public void checkLeftDiagonal() {
		if (board.cellBoard[0][0].isMarked()) {
			if (board.cellBoard[0][0].getCellMark() == board.cellBoard[1][1].getCellMark()
					&& board.cellBoard[0][0].getCellMark() == board.cellBoard[2][2].getCellMark()) {
				patternFound = true;
			}
		}
	}

	public void checkRightDiagonal() {
		if (board.cellBoard[0][2].isMarked()) {
			if (board.cellBoard[0][2].getCellMark() == board.cellBoard[1][1].getCellMark()
					&& board.cellBoard[0][2].getCellMark() == board.cellBoard[2][0].getCellMark()) {
				patternFound = true;
			}
		}
	}

	public void checkVertical() {
		for (int i = 0; i < 3; i++) {
			if (board.cellBoard[0][i].isMarked()) {
				if (board.cellBoard[0][i].getCellMark() == board.cellBoard[1][i].getCellMark()
						&& board.cellBoard[0][i].getCellMark() == board.cellBoard[2][i].getCellMark()) {
					patternFound = true;
					return;
				}
			}
		}
	}

	public void checkHorizontal() {
		for (int i = 0; i < 3; i++) {
			if (board.cellBoard[i][0].isMarked()) {
				if (board.cellBoard[i][0].getCellMark() == board.cellBoard[i][1].getCellMark()
						&& board.cellBoard[i][0].getCellMark() == board.cellBoard[i][2].getCellMark()) {
					patternFound = true;
					return;
				}
			}
		}
	}
}
