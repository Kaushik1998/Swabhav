package com.techlab.dip_protected;

import java.util.ArrayList;
import java.util.List;

public class ProjectTest {
	public static void main(String[] args) {
		BackEndDeveloper b=new BackEndDeveloper();
		FrontEndDeveloper f = new FrontEndDeveloper();
		List <Developer> list= new ArrayList<Developer>();
		list.add(f);
		list.add(b);
		Project p = new Project(list);
		p.implement();
	}
}
