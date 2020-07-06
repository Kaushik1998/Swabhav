package com.techlab.isp_protected;

public class RobotException extends RuntimeException {
	public RobotException(String msg) {
		super("It is a Robot it cannot " + msg);
	}
}
