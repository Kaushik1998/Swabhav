package com.techlab.day6.refined;

import java.util.*;

public class SubsequentArray {

	// TODO Auto-generated method stub
	public int[] input = { 42, 15, 12, 8, 6, 32 };
	public int requiredSum = 15+12+8;
	public int start = -1, end = 0;
	public int[] returnArray = input;
	
	public void setRequiredSum(int data) {
		requiredSum = data;
	}

	public void setInput(int array[]) {
		input = array;
	}

	public void setStartEnd() {
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
	}

	public int[] getArray() {
		setStartEnd();
		if (start >= 0) {
			return Arrays.copyOfRange(input, start, end+1);
		} else {
			return input;
		}
	}

}
