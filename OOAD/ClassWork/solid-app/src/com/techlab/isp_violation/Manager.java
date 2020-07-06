package com.techlab.isp_violation;

public class Manager implements IWorkable{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager starts working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager stops working");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager starts eating");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager stops eating");
	}

}
