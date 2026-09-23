package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable1 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(101, "Amit", 50000, 28));
		employees.add(new Employee(102, "Rahul", 70000, 32));
		employees.add(new Employee(103, "Priya", 50000, 26));
		employees.add(new Employee(104, "John", 90000, 35));
		employees.add(new Employee(105, "Neha", 45000, 24));
		employees.add(new Employee(106, "Alex", 70000, 30));
		employees.add(new Employee(107, "Sara", 60000, 29));
		employees.add(new Employee(108, "Vijay", 45000, 27));
		// Sort employees by name using Comparator.
		Collections.sort(employees, new Employee());
		for (Employee employee : employees) {
			System.out.println(employee);
			
			//
		}

	}

	static class Employee implements Comparator<Employee> {

		private int id;
		private String name;
		private int salary;
		private int age;

		public Employee() {
		}

		public Employee(int id, String name, int salary, int age) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		public int getAge() {
			return age;
		}

		@Override
		public String toString() {
			return id + " " + name + " " + salary + " " + age;
		}

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.salary - o2.salary;
		}
	}

}
