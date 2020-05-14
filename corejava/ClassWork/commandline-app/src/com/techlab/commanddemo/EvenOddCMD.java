package com.techlab.commanddemo;

import java.util.ArrayList;

public class EvenOddCMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		ArrayList<Integer> oddArray = new ArrayList<Integer>();

		
		int evenAverage=0;
		int oddAverage=0;
		for (int i = 0; i < args.length - 1; i++) {
			if (Integer.parseInt(args[i]) % 2 == 0) {
				evenArray.add(Integer.parseInt(args[i]));
			} else {
				oddArray.add(Integer.parseInt(args[i]));
			}
		}

		if (args[args.length - 1].contentEquals("-e")) {
			System.out.print("Even numbers are: ");
			for (int x : evenArray) {
				evenAverage +=x;
				System.out.print(x + " ");
			}
		}
		
		else if (args[args.length - 1].contentEquals("-o")) {
			System.out.print("Even numbers are: ");
			for (int x : oddArray) {
				oddAverage +=x;
				System.out.print(x + " ");
			}
		}
		
		else {
			if (Integer.parseInt(args[args.length-1]) % 2 == 0) {
				evenArray.add(Integer.parseInt(args[args.length-1]));
			} else {
				oddArray.add(Integer.parseInt(args[args.length-1]));
			}
			
			System.out.print("Even numbers are: ");
			for(int x: evenArray) {
				evenAverage +=x;
				System.out.print(x + " ");
			}
			
			System.out.println();
			
			System.out.print("Odd numbers are: ");
			for(int y: oddArray) {
				oddAverage +=y;
				System.out.print(y+ " ");
			}
		}
		
		float evensize = evenArray.size();
		float eventotal = evenAverage/evensize ;
		System.out.println("\nEven average " + (eventotal));
		
		
		float evenPercent = (evensize/args.length)*100;
		System.out.println("Even percent " + evenPercent);
		
		float oddsize= oddArray.size();
		float oddtotal = oddAverage/oddsize ;
		System.out.println("\nEven average " + (oddtotal));
		
		
		float oddPercent = (oddsize/args.length)*100;
		System.out.println("Odd percent " + oddPercent);
		
		
		
		
		
		
		
	}

}
