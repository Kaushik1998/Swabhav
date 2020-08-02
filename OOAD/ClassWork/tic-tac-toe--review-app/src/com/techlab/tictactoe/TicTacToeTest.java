package com.techlab.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.techlab.board.Board;
import com.techlab.board.analyzer.BoardAnalyzer;
import com.techlab.player.IPlayerChoice.mark;
import com.techlab.player.Player;

class TicTacToeTest {

	@Test
	void checkPlayerNames() {

		Game game = new Game();
		String[] names = { "p1", "p2" };
		Player p[] = game.getPlayers();

		for (int i = 0; i < 2; i++) {
			p[i].setPlayerName(names[i]);
		}

		String expectedPlayer1Name = p[0].getPlayerName();
		String expectedPlayer2Name = p[1].getPlayerName();

		assertEquals(expectedPlayer1Name, names[0]);
		assertEquals(expectedPlayer2Name, names[1]);
	}

}
