package com.nt.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<>();// Generic type
		arl.add("Apple");
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");
		// arl.forEach(System.out::println);
		Collections.sort(arl);
		System.out.println(arl);
		Collections.reverse(arl);
		System.out.println(arl);
		ArrayList<Integer> arl1 = new ArrayList<Integer>();
		arl1.add(5);
		arl1.add(9);
		arl1.add(2);
		arl1.add(14);
		arl1.add(7);
		int max = arl1.get(0);
		for (int num : arl1) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println(max);

		ArrayList<Integer> arl2 = new ArrayList<Integer>();
		arl2.add(5);
		arl2.add(9);
		arl2.add(2);
		arl2.add(14);
		arl2.add(7);

		int sum = 0;
		for (int i = 0; i < arl2.size(); i++) {
			sum = sum + arl2.get(i);
		}
		System.out.println(sum);

	}

}
