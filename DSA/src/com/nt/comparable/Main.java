package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// 3 Rahul 80
		// 1 Amit 90
		/// 2 Priya 75

		List<Student> std = new ArrayList<>();
		std.add(new Student(3, "Amit", 80));
		std.add(new Student(1, "Amit", 90));
		std.add(new Student(2, "Priya", 75));

		Collections.sort(std, new ComparatorStudent() {
		});
		for (Student s : std) {
			System.out.println(s.toString());
		}
	}

}
