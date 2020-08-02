package com.techlab.board;

import com.techlab.player.IPlayerChoice;

public class Cell implements IPlayerChoice {
	@Override
	public String toString() {
		return "[ " + cellMark + " ]";
	}

<<<<<<< HEAD
	private mark cellMark = null;
=======
	private mark cellMark;
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a

	public mark getCellMark() {
		return cellMark;
	}

<<<<<<< HEAD
	public void setCellMark(mark cellMark) throws AlreadyMarkedException {

		if (!isMarked()) {
			this.cellMark = cellMark;
		} else {
			throw new AlreadyMarkedException();

		}
=======
	public void setCellMark(mark cellMark) {
		this.cellMark = cellMark;
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
	}

	public boolean isMarked() {
		if (cellMark != null) {
			return true;
		}
		return false;
	}
}
