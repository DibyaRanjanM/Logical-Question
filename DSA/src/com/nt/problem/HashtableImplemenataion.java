package com.nt.problem;

/*
 * 
 * 
 * Hash Table Implementation
Problem Statement: Implement a hash table with put, get, and remove operations using an array and linked lists for collision handling. Return the value for a given key after operations.
Example: Input: put(1, 10), get(1) → Output: 10
Constraints: 1 <= key, value <= 10^6.

 */

public class HashtableImplemenataion {
	public static class Node {
		int key;
		int value;
		Node next;

		private Node(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

	}

	static class HashTable {
		private static final int SIZE = 10;
		private Node[] buckets;

		public HashTable() {
			buckets = new Node[SIZE];
		}

		private int hash(int key) {
			return key % SIZE;
		}
		// PUT

		public void put(int key, int value) {
			int index = hash(key);
			Node head = buckets[index];
			while (head != null) {
				if (head.key == key) {
					head.value = value;
					return;
				}
				head = head.next;
			}
			Node newOnNode = new Node(key, value);
			newOnNode.next = buckets[index];
			buckets[index] = newOnNode;

		}

//GET
		public int get(int key) {
			int index = hash(key);
			Node current = buckets[index];
			while (current != null) {
				if (current.key == key) {
					return current.value;

				}
				current = current.next;

			}
			return -1;

		}

		/// REMOVE
		public void remove(int key) {
			int index = hash(key);

			Node current = buckets[index];
			Node prev = null;

			while (current != null) {

				if (current.key == key) {

					if (prev == null) {
						buckets[index] = current.next;
					} else {
						prev.next = current.next;
					}

					return;
				}

				prev = current;
				current = current.next;
			}

		}

	}

}
