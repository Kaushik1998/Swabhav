package com.techlab.college;

import java.util.ArrayList;

import com.techlab.department.Department;

public class College {
	// collegeID,collegeName,Department dept[], constructor and getters, toString
	// override
	private int collegeID;
	private String collegeName;
	ArrayList<Department> listOfDepartments = new ArrayList<Department>();

	/**
	 * @param collegeID
	 * @param collegeName
	 */
	public College(int collegeID, String collegeName) {
		this.collegeID = collegeID;
		this.collegeName = collegeName;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public ArrayList<Department> getListOfDepartments() {
		return listOfDepartments;
	}

	public void addDepartment(Department d) {
		listOfDepartments.add(d);
	}

	@Override
	public String toString() {
		StringBuilder departmentNames = new StringBuilder();
		for (Department d : listOfDepartments) {
			departmentNames.append(d.getDeptName());
			departmentNames.append("\t");
		}
		return "College [\tcollegeID=" + collegeID + "\tcollegeName=" + collegeName + "\tnumber of departments="
				+ listOfDepartments.size() + "\tdepartments=" + departmentNames + "]";
	}

}
