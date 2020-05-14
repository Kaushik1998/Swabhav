package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1=new Player(101,"xyz",21);
		Player p3=new Player(103,"pqr",23);
		Player p2=new Player(102,"abc",22);
	}
	static void printinfo(Player p) {
		System.out.println("ID " + p.getId());
		System.out.println("Name "+p.getName());
		System.out.println("Age "+ p.getAge());
	}
}
