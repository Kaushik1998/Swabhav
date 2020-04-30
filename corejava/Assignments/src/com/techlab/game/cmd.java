package com.techlab.commanddemo;

import java.util.ArrayList;

public class cmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> evenArray = new ArrayList<Integer>(50);
		ArrayList<Integer> oddArray = new ArrayList<Integer>(5);
		int garbageValue=1;
		int temp=garbageValue;
		if (args.length > 0) {

			for (String val : args)
				temp = Integer.parseInt(val);
			if (temp % 2==0) {
				evenArray.add(temp);
							}
			else {
				oddArray.add(temp);
			}
		} else
			System.out.println("No command line " + "arguments found.");
		
		System.out.print("Even numbers are: ");
		for(int x: evenArray) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		System.out.print("Odd numbers are: ");
		for(int y: oddArray) {
			System.out.print(y+ " ");
		}
	}

}
