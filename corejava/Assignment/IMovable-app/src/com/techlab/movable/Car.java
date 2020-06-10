package com.techlab.movable;

public class Car implements IMovable{

	@Override
	public void start() {
		System.out.println("Car  Started ");	
	}

	@Override
	public void stop() {
		System.out.println("Car Stop");	
	}

}