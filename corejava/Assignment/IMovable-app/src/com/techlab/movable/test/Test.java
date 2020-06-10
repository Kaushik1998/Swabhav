package com.techlab.movable.test;

import com.techlab.movable.Bike;
import com.techlab.movable.Car;
import com.techlab.movable.IMovable;
import com.techlab.movable.Truck;

public class Test {

	public static void main(String[] args) {

		IMovable obj[] = new IMovable[3];
		obj[0] = new Truck();
		obj[1] = new Car();
		obj[2] = new Bike();
		printInfo(obj);
	}

	public static void printInfo(IMovable obj[]) {
		for (int i = 0; i < obj.length; i++) {
			System.out.println();
			obj[i].start();
			obj[i].stop();
		}
	}

}