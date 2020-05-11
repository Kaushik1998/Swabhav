package com.techlab.day6.refined;

public class GetMissingNumber {
	public int input[] = { 1, 4, 5, 3, 2, 8, 6 };
	public int small = input[0], big = input[0];

	public void setInput(int array[]) {
		input = array;
	}

	public void setSB() {
		for (int i : input) {
			if (i > big) {
				big = i;
			}
			if (i < small) {
				small = i;
			}
		}
	}

	public int[] getMissingNumber() {
		setSB();
		int returnArray[]= {0,0,0,0,0};
		int index=0;
		for (int i = small; i <= big; i++) {
			if (!check(i, input)) {
				returnArray[index] = i;
				index++;
			}
		}
		return returnArray;
	}

	public static boolean check(int a, int arr[]) {
		for (int i : arr) {
			if (i == a) {
				return true;
			}
		}
		return false;
	}
}

/*
 public class GetMissingNumber {
	public static void main(String[] args) {
		Check c = new Check();
		int data[] = c.getMissingNumber();
		System.out.println(data[1]);
	}
}
*/
