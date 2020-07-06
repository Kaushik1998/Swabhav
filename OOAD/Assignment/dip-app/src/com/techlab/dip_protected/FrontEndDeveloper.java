package com.techlab.dip_protected;

public class FrontEndDeveloper implements Developer {
	@Override
	public void develop() {
		writeJavascript();
	}

	public void writeJavascript() {
		System.out.println("Writing Javascript");
	}
}