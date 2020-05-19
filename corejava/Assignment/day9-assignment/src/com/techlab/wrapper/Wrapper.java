package com.techlab.wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPrimitive=20;  
		Integer iWrapper=Integer.valueOf(intPrimitive);
		Integer jJwrapper=intPrimitive;
		  
		System.out.println(intPrimitive+" "+iWrapper+" "+jJwrapper);  
		
		
	    int a=50;  
        Integer iBoxing=new Integer(a);//Boxing  
  
        Integer jAutoBoxing=5;//Boxing  
          
        System.out.println(iBoxing+" "+jAutoBoxing); 
        
        
        Integer i=new Integer(50);  
        int a4=i;  
          
        System.out.println(a4); 
	}

}
