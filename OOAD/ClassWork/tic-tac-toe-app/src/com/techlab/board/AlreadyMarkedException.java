package com.techlab.board;

public class AlreadyMarkedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlreadyMarkedException(String message) {
		super(message);
	}

	public AlreadyMarkedException(int x, int y) {
		super("At Cell " + x + y);
	}
}
