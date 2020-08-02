package com.techlab.board;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.techlab.player.IPlayerChoice.mark;

class CellTest {

	@Test
	void if_mark_is_empty_when_cell_is_created() {
		Cell cell = new Cell();

		mark expectectedCellMark = null;
		mark actualCellMark = cell.getCellMark();

		assertEquals(expectectedCellMark, actualCellMark);
	}

	@Test
	void if_marking_is_done_properly() {
		Cell cell = new Cell();
		cell.setCellMark(mark.X);

		boolean expectedCellMarkedStatus = true;
		boolean actualCellMarkedStatus = cell.isMarked();

		assertEquals(expectedCellMarkedStatus, actualCellMarkedStatus);
	}

	@Test
	void if_set_mark_works_properly() {
		Cell cell = new Cell();
		cell.setCellMark(mark.X);

		mark expectedCellMark = mark.X;
		mark actualCellMark = cell.getCellMark();

		assertEquals(expectedCellMark, actualCellMark);
	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_in_a_call_and_throws_exception_if_we_try() {
		Cell cell = new Cell();

		String expectedException = "Already Marked";
		String actualException = null;
		try {
			cell.setCellMark(mark.O);
			cell.setCellMark(mark.X);
		} catch (AlreadyMarkedException e) {
			actualException = e.getMessage();
		}

		assertTrue(expectedException.contains(actualException));
	}
	
	@Test
	void testExpectedException() {
	 Cell cell=new Cell();
	 cell.setCellMark(mark.O);
	 
	  Assertions.assertThrows(AlreadyMarkedException.class, () -> {
		  cell.setCellMark(mark.O);
	  });
	 
	}


}
