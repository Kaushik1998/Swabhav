package com.techlab.serialize;

import java.io.Serializable;

public class Serialize implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;  
	 public String name;  
	 public Serialize(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }
}
