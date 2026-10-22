package com.nt.stream.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		// Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?

		/*
		 * When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; and int[]
		 */
		int[] arr = { 10, 15, 8, 49, 25, 98, 32 };
		Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));

		/*
		 * When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; and return
		 * type is list
		 */
		int[] arr1 = { 10, 15, 8, 49, 25, 98, 32 };
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr1).boxed()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(collect);

		// 2-Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		myList.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
//When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; 
		// and return type is list */
		int[] arr2 = { 10, 15, 8, 49, 25, 98, 32 };
		List<String> collect2 = Arrays.stream(arr2).boxed().map(n -> n + "").filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(collect2);
		/*
		 * When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; and return
		 * type is int[]
		 */
		int[] arr3 = { 10, 15, 8, 49, 25, 98, 32 };
		int[] array = Arrays.stream(arr3).filter(n -> String.valueOf(n).startsWith("1")).toArray();
		System.out.println(Arrays.toString(array));

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?

		List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList1.stream().distinct().forEach(System.out::println);
		System.out.println("-------------------------------------------");
		/* Way 2 - Gives list of all distinct/unique values */
		List<Integer> myList2 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		Set<Integer> set = new HashSet<Integer>(myList2);
		List<Integer> collect3 = set.stream().collect(Collectors.toList());
		collect3.forEach(System.out::println);

//Given the list of integers, find the first element of the list using Stream functions?
		List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		myList3.stream().findFirst().ifPresent(System.out::println);

		/* or can also try below single line code */
		/* When numbers are given as Array */
		int[] myList4 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		Arrays.stream(myList4).boxed().findFirst().ifPresent(System.out::println);

		// Given a list of integers, find the total number of elements present in the
		// list using Stream functions?
		List<Integer> myList5 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList5.stream().count();
		System.out.println(count);
		/* or can also try below line code */
		/* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
		int[] arr4 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		long count2 = Arrays.stream(arr4).boxed().count();
		System.out.println(count2);
		// Given a list of integers, find the maximum value element present in it using
		// Stream functions?
		List<Integer> myList6 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Integer integer = myList6.stream().max(Integer::compareTo).get();
		System.out.println(integer);
		/* or we can try using below way */
		/* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
		int[] arr5 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		int asInt = Arrays.stream(arr5).max().getAsInt();
		System.out.println(asInt);
		// 7. Given a String, find the first non-repeated character in it using Stream
		// functions?
		String input = "Java articles are Awesome";
		Character orElse = input.chars().mapToObj(c -> (char) c)
				.filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch)).findFirst().orElse(null);
		System.out.println(orElse);
	}

}
