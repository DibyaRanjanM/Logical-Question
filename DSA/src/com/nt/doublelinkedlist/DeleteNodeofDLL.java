package com.nt.doublelinkedlist;

//Delete the Node of DoublyLinkedlIst
public class DeleteNodeofDLL {
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

		System.out.println("Before deletion:");
		print(head);

		deleteNode(n3);

		System.out.println("After deleting 5:");
		print(head);

	}

	private static void deleteNode(Node temp) {
		Node prev = temp.back;
		Node front = temp.next;
		if (front == null) {
			prev.next = null;
			temp.back = null;
			return;
		}
		prev.next = front;
		front.back = prev;
		temp.next = temp.back = temp.back = null;

	}

	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

}
