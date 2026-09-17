package com.nt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find all employees who are 18 years or older and store their ages in a new List.
public class EmployeeAge {
	public static void main(String[] args) {
		List<Integer> ages = Arrays.asList(22, 17, 35, 15, 28, 12, 40, 19);
		Set<Integer> collect = ages.stream().filter(age -> age > 18).collect(Collectors.toSet());
		collect.forEach(System.out::println);
	}

}
