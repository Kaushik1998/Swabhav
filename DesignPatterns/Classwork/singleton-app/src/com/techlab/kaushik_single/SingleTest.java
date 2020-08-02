package com.techlab.kaushik_single;

public class SingleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass man = SingletonClass.getObject();
		System.out.println(man.message());
	}

}
