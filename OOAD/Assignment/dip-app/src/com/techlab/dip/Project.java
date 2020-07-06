package com.techlab.dip;

public class Project {
	public static void main(String a[]) {
		BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
		FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
		backEndDeveloper.writeJava();
		frontEndDeveloper.writeJavascript();
	}
}