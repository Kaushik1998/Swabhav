package com.techlab.player;

public class Player {
	private int id;
	private String name;
	private int age;
	/*public Player(int id,String name,int age)//local var
	{
	id=id;
	name=name;
	age=age;
	}*/
	
	public Player(int nid,String nname,int nage)//local var
	{
	id=nid;
	name=nname;
	age=nage;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("ID " + getId());
		System.out.println("Name "+getName());
		System.out.println("Age "+ getAge());
	}
}
