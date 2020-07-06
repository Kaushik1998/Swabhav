package com.techlab.board;

import com.techlab.player.IPlayerChoice;

public class Cell implements IPlayerChoice {
	@Override
	public String toString() {
		return "[ " + cellMark + " ]";
	}

	private mark cellMark;

	public mark getCellMark() {
		return cellMark;
	}

	public void setCellMark(mark cellMark) {
		this.cellMark = cellMark;
	}

	public boolean isMarked() {
		if (cellMark != null) {
			return true;
		}
		return false;
	}
}
