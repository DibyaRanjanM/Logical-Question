package com.nt.doublelinkedlist;

//Remove Kth element from doubly linkedlist
public class RemoveKthElement {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7 };

		Node head = convertArray2Dll(arr);

		System.out.println("Original DLL:");
		print(head);

		head = removeKthElement(head, 3);

		System.out.println("After removing 3rd node:");
		print(head);

	}

	private static Node removeKthElement(Node head, int k) {
		if (head == null) {
			return null;
		}
		int count = 0;
		Node kNode = head;
		while (kNode != null) {
			count++;
			if (count == k)
				break;
			kNode = kNode.next;

		}
		Node prev = kNode.back;
		Node front = kNode.next;

		if (prev == null && front == null) {
			return null;

		} else if (prev == null) {
			return deleteHead(head);
		} else if (front == null) {
			return deleteTail(head);
		}
		prev.next = front;
		front.back = prev;
		kNode.next = null;
		kNode.back = null;
		return head;
	}

	public static Node deleteHead(Node head) {
		if (head == null || head.next == null) {
			return null;

		}
		Node prev = head;
		head = head.next;
		head.back = null;
		prev.next = null;
		return head;

	}

	public static Node deleteTail(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		Node newNode = tail.back;
		newNode.next = null;
		tail.back = null;
		return head;
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
	}

	private static void print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;

		}
		System.out.println();
	}

}
