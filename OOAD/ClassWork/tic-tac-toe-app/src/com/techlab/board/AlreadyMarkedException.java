package com.techlab.board;

public class AlreadyMarkedException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

<<<<<<< HEAD
	public AlreadyMarkedException() {
		super("Already Marked");
	}

=======
>>>>>>> 501c9bc91030b6765ec3d2a26acda80f6e034f6a
	public AlreadyMarkedException(String message) {
		super(message);
	}

	public AlreadyMarkedException(int x, int y) {
		super("At Cell " + x + y);
	}
}
