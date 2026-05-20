package com.nt.list;

import java.util.Iterator;
import java.util.Vector;

public class ForEachAndForEachRemainning {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Avocado");
		fruits.add("Orange");
		fruits.forEach(System.out::println);

		Iterator<String> iterator = fruits.iterator();
		iterator.forEachRemaining(System.out::println);
	}

}
