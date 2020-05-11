package com.techlab.day6;

public class SeperateZeroArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1, -5, 0, 0, 8, 0, 1};
		int zeroIndex = 0;
		//Here i put all non zero elements in front of the array
	      for(int i=0; i<input.length; i++){
	    	  //here is the logic . if the input[i] is not zero i append zeroindex to input i
	    	  //Should i connect mic
	         if(input[i]!=0){
	            input[zeroIndex]=input[i];
	            zeroIndex++;
	         }
	      }
	      //till input = { 1,-5,8,1}
	      while(zeroIndex<input.length) {
	         input[zeroIndex] = 0;
	         zeroIndex++;
	      }
		for(int i: input) {
			System.out.print(i+" ");
		}
	}

}
