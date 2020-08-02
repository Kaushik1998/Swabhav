package com.techlab.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.techlab.player.IPlayerChoice.mark;

class BoardTest {

	@Test
	void check_if_board_is_created_with_proper_number_of_Cells() {
		Board board = new Board();

		int expectedCellCount = 9;
		int actualCellCount = 0;

		for (Cell[] row : board.getCellBoard()) {
			for (Cell cell : row) {
				actualCellCount++;
			}
		}

		assertEquals(expectedCellCount, actualCellCount);
	}

	@Test
	void check_if_board_has_empty_cells() {
		Board board = new Board();
		boolean expectedBoardIsEmpty = true;
		boolean actualBoardIsEmpty = true;

		for (Cell[] row : board.getCellBoard()) {
			for (Cell cell : row) {
				if (cell.isMarked()) {
					actualBoardIsEmpty = false;
				}
			}
		}

		assertEquals(expectedBoardIsEmpty, actualBoardIsEmpty);
	}

	@Test
	void check_if_marks_can_be_set_on_a_given_position() {
		Board board = new Board();

		int x = 0;
		int y = 0;
		mark testMark = mark.O;
		board.addMark(x, y, testMark);

		mark expectedMark = mark.O;
		mark actualMark = board.getCellMark(x, y);

		assertEquals(expectedMark, actualMark);
	}

	@Test
	void testExpectedException() {
		Board board = new Board();
		int x = 0;
		int y = 0;
		mark playerMark = mark.O;
		board.addMark(x, y, playerMark);

		Assertions.assertThrows(AlreadyMarkedException.class, () -> {
			board.addMark(x, y, playerMark);
		});

	}

	@Test
	void check_if_board_full_returns_true_if_board_is_full() {
		Board board = new Board();
		boolean expectedBoardIsFull = true;
		boolean actualBoardIsFull = true;

		mark cellMark = mark.O;

		for (Cell[] row : board.getCellBoard()) {
			for (Cell cell : row) {
				cell.setCellMark(cellMark);
			}
		}

		for (Cell[] row : board.getCellBoard()) {
			for (Cell cell : row) {
				if (!cell.isMarked()) {
					actualBoardIsFull = false;
				}
			}
		}

		assertEquals(expectedBoardIsFull, actualBoardIsFull);
	}

}
