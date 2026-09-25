package com.nt.comparable;

import java.util.Comparator;

public class ComparatorStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		//SORT
		// int compareTo = o1.name.compareTo(o2.name);
//		if (compareTo == 0) {
//			return Integer.compare(o1.id, o2.id);
//		}
		// return compareTo;

		return Integer.compare(o2.marks, o1.marks);

	}

}
