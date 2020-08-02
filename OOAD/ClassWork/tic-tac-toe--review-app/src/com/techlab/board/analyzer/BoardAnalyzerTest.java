package com.techlab.board.analyzer;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.techlab.board.Board;
import com.techlab.board.IBoard;
import com.techlab.player.IPlayerChoice.mark;

class BoardAnalyzerTest implements IBoardAnalyzer,IBoard {

	@Test
	void testLeftDiagonal() {
		Board board = new Board();
		BoardAnalyzer analyzer = new BoardAnalyzer();
		analyzer.setGameBoard(board);
		mark playermark = mark.X;

		board.addMark(0, 0, playermark);
		board.addMark(1, 1, playermark);
		board.addMark(2, 2, playermark);

		analyzer.checkLeftDiagonal();
		boolean actualResult = analyzer.isPatternFound();

		assertTrue(actualResult);
	}

	@Test
	void testRightDiagonal() {

		Board b = new Board();
		BoardAnalyzer analyzer= new BoardAnalyzer();
		analyzer.setGameBoard(b);
		mark playermark = mark.X;

		b.addMark(0, 2, playermark);
		b.addMark(1, 1, playermark);
		b.addMark(2, 0, playermark);

		analyzer.checkRightDiagonal();
		boolean actualResult = analyzer.isPatternFound();

		assertTrue(actualResult);
	}

	@Test
	void testHorizonal() {

		Board b = new Board();
		BoardAnalyzer analyzer= new BoardAnalyzer();
		analyzer.setGameBoard(b);
		mark playermark = mark.X;

		b.addMark(0, 0, playermark);
		b.addMark(0, 1, playermark);
		b.addMark(0, 2, playermark);

		analyzer.checkHorizontal();
		boolean actualResult = analyzer.isPatternFound();

		assertTrue(actualResult);
	}
	
	@Test
	void testVertical() {

		Board b = new Board();
		BoardAnalyzer analyzer= new BoardAnalyzer();
		analyzer.setGameBoard(b);
		mark playermark = mark.X;

		b.addMark(0, 0, playermark);
		b.addMark(1, 0, playermark);
		b.addMark(2, 0, playermark);

		analyzer.checkVertical();
		boolean actualResult = analyzer.isPatternFound();

		assertTrue(actualResult);
	}

	
}
