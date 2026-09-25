package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparator{
	public static void main(String[] args) {

		List<Student> student = new ArrayList<>();
		student.add(new Student(104, "Roshan"));
		student.add(new Student(108, "Dibya"));
		student.add(new Student(102, "Mishra"));
		Collections.sort(student, new Student());
		for (Student s1 : student) {
			System.out.println(s1.toString());
		}

	}

	static class Student implements Comparator<Student> {
		int id;
		String name;

		private Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		private Student() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

		@Override
		public int compare(Student o1, Student o2) {
			
			// TODO Auto-generated method stub
			// int compare = Integer.compare(o1.salary, o2.salary);
			
			
			
			int compare = Integer.compare(o1.id, o2.id);
			return compare;
		}

	}

}
