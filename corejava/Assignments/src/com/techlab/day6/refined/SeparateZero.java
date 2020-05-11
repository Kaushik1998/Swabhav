package com.techlab.day6.refined;

public class SeparateZero {
	public int input[] = { 4, 6, 5, 0, 8, 0, 20 };
	public int zeroIndex = 0;
	
	public void setInput(int array[]) {
		input=array;
	}
	
	public void separate() {
	      for(int i=0; i<input.length; i++){
		         if(input[i]!=0){
		            input[zeroIndex]=input[i];
		            zeroIndex++;
		         }
		      }
		      while(zeroIndex<input.length) {
		         input[zeroIndex] = 0;
		         zeroIndex++;
		      }
	}
	
	public int[] getArray() {
		separate();
		return input;
		}
}

/*
 * public class SeparateZero{
	public static void main(String[] args) {
		SetSeparateZero s=new SetSeparateZero();
		int test[]=s.getArray();
		for(int i:test) {
			System.out.println(i);
		}
	}
}
*/
