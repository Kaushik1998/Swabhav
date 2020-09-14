package com.techlab.list;

import java.util.ArrayList;
import java.util.List;

import com.techlab.student.Student;

public class MyList {
	private List<Student> list;

	public MyList() {
		super();
		// TODO Auto-generated constructor stub
		list = new ArrayList<Student>();
	}

	public List<Student> getList() {
		return list;
	}

	public void updateToList(Student student) {
		list.add(student);
	}

	public void removeFromList(Student student) {
		list.remove(student);
	}

	@Override
	public String toString() {
		return "MyList [list=" + list + "]";
	}
	
	

}
