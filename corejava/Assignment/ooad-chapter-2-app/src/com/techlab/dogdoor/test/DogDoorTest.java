package com.techlab.dogdoor.test;

import com.techlab.dogdoor.*;

public class DogDoorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DogDoor door = new DogDoor();    
		 Remote remote = new Remote(door);   
		 
		 System.out.println();
		 remote.pressButton(); 
		 
		 System.out.println("\nFido has gone outside...");    		 
		 System.out.println("\nFidos all done...");   
		 
		 try {
			 Thread.currentThread().sleep(10000);
		 } catch (InterruptedException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 System.out.println("Fido is stuck outside");
		 System.out.println("\nFido barks");
		 remote.pressButton();
		 
		 System.out.println("Fido is back inside");
	}
}
