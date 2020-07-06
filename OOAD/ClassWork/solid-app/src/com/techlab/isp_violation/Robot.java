package com.techlab.isp_violation;

import com.techlab.isp_protected.RobotException;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot starts working");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stops working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		throw new RobotException("Start Eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		throw new RobotException("Stop Eating");
	}

}
