package com.techlab.automobile;

public class Bmw implements IAutoMobile {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println(this + " has started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println(this + " has stopped");
	}

	@Override
	public String toString() {
		return "Bmw " + this.hashCode();
	}

}
