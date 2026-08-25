package com.nt.doublelinkedlist;
//Reverse a Doubly Linked List
public class ReverseaDoubleLinkedList {
	public static void main(String[] args) {
		Node head = new Node(2);

		Node n2 = new Node(4);
		Node n3 = new Node(5);
		Node n4 = new Node(7);

		head.next = n2;
		n2.back = head;

		n2.next = n3;
		n3.back = n2;

		n3.next = n4;
		n4.back = n3;

		System.out.println("Original DLL:");
		print(head);

		head = reverseDLL(head);

		System.out.println("Reversed DLL:");
		print(head);

	}

	public static Node reverseDLL(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node prev = null;
		Node current = head;
		while (current != null) {
			prev = current.back;
			current.back = current.next;
			current.next = prev;
			current = current.back;

		}
		return prev.back;

	}

	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}
