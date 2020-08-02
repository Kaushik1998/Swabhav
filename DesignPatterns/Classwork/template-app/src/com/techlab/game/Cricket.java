package com.techlab.game;

public class Cricket extends Game {

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println(this + " has initialized");
	}

	@Override
	public void startPlay() {
		// TODO Auto-generated method stub
		System.out.println(this + " has Started");
	}

	@Override
	public void endPlay() {
		// TODO Auto-generated method stub
		System.out.println(this + " has Ended");
	}

	@Override
	public String toString() {
		return "Cricket";
	}

	
}
