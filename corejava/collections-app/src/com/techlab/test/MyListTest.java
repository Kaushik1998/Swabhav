package com.techlab.test;

import java.util.List;

import com.techlab.list.MyList;
import com.techlab.student.Student;

public class MyListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kaushik = new Student("Kaushik", 93);
		Student paras = new Student("Paras", 99);

		MyList list = new MyList();
		list.updateToList(kaushik);
		list.updateToList(paras);

		list.removeFromList(paras);

		List<Student> studentList = list.getList();

		for (Student l : studentList) {
			System.out.println(l.getName());
			System.out.println(l.getRollNo());
			System.out.println();
		}

	}

}
