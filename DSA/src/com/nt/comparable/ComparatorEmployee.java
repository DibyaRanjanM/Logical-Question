package com.nt.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorEmployee {
	public static void main(String[] args) {

		List<Employee> emp = Arrays.asList(new Employee(99, "Mishara", 56), new Employee(89, "Roshan", 96),
				new Employee(9, "Dibya", 15), new Employee(909, "moti", 86));

		Comparator<Employee> comp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.id, o2.id);
			}
		};
		emp.sort(Comparator.comparing(Employee::getId).thenComparing(Employee::getName));
		emp.forEach(System.out::println);

		emp.sort(Comparator.comparing(Employee::getMark));
		emp.forEach(System.out::println);
		System.out.println("----------------------");
		System.err.println("bfsjhbhfdf");

		Comparator<Employee> comp1 =

				(o1, o2) -> o1.getName().compareTo(o2.getName());
		emp.forEach(System.out::println);

	}

}
