package com.nt.list;

import java.util.ArrayList;

/*
 * 
 * Search an Element

Check whether a given number exists in the ArrayList.
 */
public class SearchElement {
	public static void main(String[] args) {
		ArrayList<Integer> arl2 = new ArrayList<Integer>();
		arl2.add(5);
		arl2.add(9);
		arl2.add(2);
		arl2.add(14);
		arl2.add(7);

		int target = 0;
		if (arl2.contains(target)) {
			System.out.println("found");
		} else {
			System.out.println("Not Found");
		}

		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(7);
		arl.add(9);
		arl.add(2);
		arl.add(14);
		arl.add(7);
		ArrayList<Integer> unique = new ArrayList<Integer>();
		for (int i = 0; i < arl.size(); i++) {
			if (!unique.contains(arl.get(i))) {
				unique.add(arl.get(i));
			}

		}
		System.out.println(unique);

	}

}
