package com.techlab.player;

import com.techlab.board.IBoard;

public class Player implements IPlayerChoice,IBoard {
	private String playerName;
	private mark playerMark;

	public Player() {

	}


	@Override
	public String toString() {
		return "Player Name=" + playerName + ", playerMark=" + playerMark;
	}


	public Player(String playerName, mark playerMark) {
		super();
		this.playerName = playerName;
		this.playerMark = playerMark;
	}

	public String getPlayerName() {
		return playerName;
	}

	public mark getPlayerMark() {
		return playerMark;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setPlayerMark(mark playerMark) {
		this.playerMark = playerMark;
	}
	
	public void putMark(int x,int y) {
		board.addMark(x, y, getPlayerMark());
	}

}
