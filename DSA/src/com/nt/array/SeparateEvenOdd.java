package com.nt.array;
/*
 * 
 * Given a list of integers, separate even and odd numbers into two separate lists.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateEvenOdd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(5);
		nums.add(9);
		nums.add(4);
		nums.add(7);
		System.out.println("The numbers are" + nums);
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for (Integer num : nums) {
			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}
		System.out.println("Even Numbers: " + even);
		System.out.println("Odd Numbers: " + odd);
		sc.close();

	}
}
