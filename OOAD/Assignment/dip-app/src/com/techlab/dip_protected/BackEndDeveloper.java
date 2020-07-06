package com.techlab.dip_protected;

public class BackEndDeveloper implements Developer {
	@Override
	public void develop() {
		writeJava();
	}

	private void writeJava() {
		System.out.println("Writing Java");
	}
}