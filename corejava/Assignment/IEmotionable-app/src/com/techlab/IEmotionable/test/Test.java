package com.techlab.IEmotionable.test;

import com.techlab.IEmotionable.Boy;
import com.techlab.IEmotionable.IEmotionable;
import com.techlab.IEmotionable.ISocializable;
import com.techlab.IEmotionable.Man;

public class Test {

	public static void main(String[] args) {
		Man man = new Man();
		atTheParty(man, man);
		atTheMovie(man);

		Boy boy = new Boy();
		atTheParty(man, boy);
		atTheMovie(boy);

	}
	
	static void atTheParty(ISocializable sobj,IEmotionable eobj) {
		System.out.println();
		sobj.wish();
		sobj.depart();
		eobj.cry();
		eobj.laugh();
	}

	static void atTheMovie(IEmotionable eobj) {
		System.out.println();
		eobj.cry();
		eobj.laugh();
	}

}