package com.nt.doublelinkedlist;



public class ArrayToDLL {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7 };
		Node convertArrayToLinkedList = convertArray2Dll(arr);
		print(convertArrayToLinkedList);

	}

	

	private static void print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}
		System.out.println();
	}

	private static Node convertArray2Dll(int[] arr) {
	    Node head = new Node(arr[0]);
	    Node prev = head;

		for (int i = 1; i < arr.length; i++) {
	        Node temp = new Node(arr[i], null, prev);
	        prev.next = temp;
	        prev = temp;
	    }

	    return head;
	}}


