package com.techlab.pattern_analyzer;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.techlab.board.Board;
import com.techlab.player.IPlayerChoice.mark;

class PatternAnalyzerTest {

	@Test
	void LeftTest() {
		Board b = new Board(5,4);
		PatternAnalyzer p = new PatternAnalyzer();
		p.setGameBoard(b);
		
		//b.addMark(0, 0, mark.O);
		b.addMark(1, 1, mark.O);
		b.addMark(2, 2, mark.O);
		b.addMark(3, 3, mark.O);
		//b.addMark(3, 3, mark.O);
		
		p.checkPattern(1, 1);
		
		assertTrue(p.isPatternFound());
	}
	
	@Test
	void RightTest() {
		Board b2 = new Board(6,6);
		PatternAnalyzer p = new PatternAnalyzer();
		p.setGameBoard(b2);
		
		b2.addMark(0, 3, mark.O);
		b2.addMark(1, 2, mark.O);
		b2.addMark(2, 1, mark.O);

		
		p.checkPattern(1, 2);
		
		assertTrue(p.isPatternFound());
	}
	
	@Test
	void verticalTest() {
		Board b = new Board(6,6);
		PatternAnalyzer p = new PatternAnalyzer();
		p.setGameBoard(b);
		
		b.addMark(0, 0, mark.O);
		b.addMark(1, 0, mark.O);
		b.addMark(2, 0, mark.O);

		
		p.checkPattern(0, 0);
		
		assertTrue(p.isPatternFound());
	}
	
	@Test
	void horizontalTest() {
		Board b = new Board(6,5);
		PatternAnalyzer p = new PatternAnalyzer();
		p.setGameBoard(b);
		
		b.addMark(0, 03, mark.O);
		b.addMark(0, 02, mark.O);
		b.addMark(0, 01, mark.O);

		
		p.checkPattern(0, 01);
		
		assertTrue(p.isPatternFound());
	}
	
	

}
