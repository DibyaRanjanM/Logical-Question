package com.nt.problem;

import com.nt.problem.HashtableImplemenataion.HashTable;

public class MainHashTable {
	public static void main(String[] args) {
		HashTable table = new HashTable();

		table.put(1, 10);
		table.put(11, 110); // Collision with key 1

		System.out.println(table.get(1));
		System.out.println(table.get(11));

		table.remove(1);

		System.out.println(table.get(1));

	}

}
