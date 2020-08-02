package com.techlab.pattern_analyzer;

import com.techlab.board.Board;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b = new Board(5,4);
		//PatternAnalyzer p = new PatternAnalyzer();
		//p.setGameBoard(b);
		
		b.createBoard();
		System.out.println(b);
		
		
	}

}
