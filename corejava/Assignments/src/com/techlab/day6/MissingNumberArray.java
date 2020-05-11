package com.techlab.day6;

public class MissingNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1, 4, 5, 3, 2, 8, 6};
		int small=input[0],big=input[0];
		for(int i:input){
			if(i>big) {
				big=i;
			}
			if(i<small) {
				small=i;
			}
		}
		
		for(int i=small;i<=big;i++) {
			if(!check(i,input)) {
				System.out.println("Missing Number is = "+i);
			}
		}
	}
	
	public static boolean check(int a, int arr[]) {
		for(int i:arr) {
			if(i==a) {
				return true;
			}
		}
		return false;
	}
}
