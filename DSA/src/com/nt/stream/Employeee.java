package com.nt.stream;

class Employeee {
	String name;
	String department;

	Employeee(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public String toString() {
		return name;
	}
}