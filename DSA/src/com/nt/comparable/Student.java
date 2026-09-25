package com.nt.comparable;

class Student {
	int id;
	String name;
	int marks;

	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}
}