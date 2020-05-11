package com.techlab.day6;

public class SubsequentSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 42, 15, 12, 8, 6, 32 };
		int requiredSum = 42;
		int start = -1, end = 0;
		if (input[0] == requiredSum) {
			start = 0;
		} else {
			for (int i = 0; i < input.length; i++) {
				int sum = 0;
				for (int j = i; j < input.length; j++) {
					sum = sum + input[j];
					if (sum == requiredSum) {
						start = i;
						end = j;
					}
				}
			}
		}

		if (start >= 0) {
			for (int i = start; i <= end; i++) {
				System.out.print(input[i] + " ");
			}
		} else {
			System.out.println("No Subsequent Array found ");
		}
	}

}
