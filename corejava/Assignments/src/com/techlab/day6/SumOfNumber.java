package com.techlab.day6;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 4, 6, 5, -10, 8, 5, 20 };
		int desiredSum = 10;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if ((input[i] + input[j]) == desiredSum) {
					System.out.println(input[i] + " + " + input[j] + " = " + desiredSum);
				}
			}
		}
	}

}
