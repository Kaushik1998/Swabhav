package com.techlab.isp_violation.test;

import com.techlab.isp_violation.Manager;
import com.techlab.isp_violation.Robot;

public class ISPViolationTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Robot robot = new Robot();
		
		manager.startEat();
		manager.stopEat();
		manager.startWork();
		manager.stopWork();
		
		robot.startEat();
		robot.stopEat();
		robot.startWork();
		robot.stopWork();
		
	}

}
