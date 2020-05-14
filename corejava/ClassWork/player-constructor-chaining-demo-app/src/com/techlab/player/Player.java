package com.techlab.player;

public class Player {
	private int id;
	private String name;
	private int age;
	private int score;
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
	
	public Player(int id,String name,int age,int score )//local var
	{
	this(id,name,age);
	this.score=score;
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
