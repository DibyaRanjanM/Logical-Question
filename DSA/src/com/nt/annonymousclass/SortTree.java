package com.nt.annonymousclass;

import java.util.Comparator;
import java.util.TreeSet;

//Sort TreeSet in Descending Order Using Anonymous Class
public class SortTree {

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}

		});

		tr.add(10);
		tr.add(30);
		tr.add(20);
		tr.add(50);
		tr.add(40);

		System.out.println(tr);
		System.out.println("================================");
		// Sort Employees by Salary Using Anonymous Class

		TreeSet<Employee> tr1 = new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				// return Integer.compare(o1.salary, o2.salary);
				int result = Integer.compare(o1.salary, o2.salary);
				if (result == 0) {
					result = o1.name.compareTo(o2.name);
				}
				return result;
			}
		});
		/*
		 * 
		 * Sort Employees:
		 * 
		 * Rule 1
		 * 
		 * Salary ascending.
		 * 
		 * Rule 2
		 * 
		 * If salary same → Name ascending.
		 */

		tr1.add(new Employee(101, "Rahul", 50000));
		tr1.add(new Employee(102, "Amit", 50000));
		tr1.add(new Employee(103, "Priya", 60000));
		tr1.add(new Employee(104, "John", 50000));
		System.out.println(tr1);

	}

}
