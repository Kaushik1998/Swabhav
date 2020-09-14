package com.techlab.set;

import java.util.HashSet;
import java.util.Set;

import com.techlab.student.Student;

public class MySet {
	private Set<Student> set;

	public MySet() {
		super();
		set = new HashSet<Student>();
	}

	public Set<Student> getSet() {
		return set;
	}

	public void updateToSet(Student student) {
		set.add(student);
	}

	public void removeFromSet(Student student) {
		set.remove(student);
	}

	@Override
	public String toString() {
		return "MySet [set=" + set + "]";
	}

}
