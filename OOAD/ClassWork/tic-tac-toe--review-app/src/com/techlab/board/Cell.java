package com.techlab.board;

import com.techlab.player.IPlayerChoice;

public class Cell implements IPlayerChoice {
	@Override
	public String toString() {
		return "[ " + cellMark + " ]";
	}

	private mark cellMark = null;

	public mark getCellMark() {
		return cellMark;
	}

	public void setCellMark(mark cellMark) throws AlreadyMarkedException {

		if (!isMarked()) {
			this.cellMark = cellMark;
		} else {
			throw new AlreadyMarkedException();

		}
	}

	public boolean isMarked() {
		if (cellMark != null) {
			return true;
		}
		return false;
	}
}
