package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c = new Candidate(1, "First", 21, "B");
		c.setLocal(c);
		Candidate c2 = new Candidate(2,"Second", 4,"C");
		c.whoIsBetter(c2);
		Candidate n=c.getLocal();
		c.whoIsOlder(c2);
		if(c==n) {
			System.out.println(c.getName()+" Is better than "+ c2.getName());
		}
		else {
			System.out.println(c2.getName()+" Is better than "+ c.getName());
		}
		printInfo(n);
	}
	public static void printInfo(Candidate c) {
		System.out.println("Age : " + c.getAge());
		System.out.println("Name : "+c.getName());
		System.out.println("ID : " + c.getID());
	}
}
