package com.techlab.singleResponsibility;

public class SingleResponsibility {
	public void changeEmail(String user) {
		if (SecurityService.checkAccess(user)) {
//Grant option to change
		}
	}

}

class SecurityService {
	public static boolean checkAccess(String user) {
		return false;
//check the access.
	}
}