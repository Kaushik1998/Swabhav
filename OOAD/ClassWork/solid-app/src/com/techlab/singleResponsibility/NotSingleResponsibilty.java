package com.techlab.singleResponsibility;

public class NotSingleResponsibilty {
	public void changeEmail(String user) {
		if (checkAccess(user)) {
//Grant option to change
		}
	}

	public boolean checkAccess(String user) {
		return false;
//Verify if the user is valid.
	}
}
