package com.nt.doublelinkedlist;
//insert element before kth position
public class InsertValueBeforeKthElement {
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

		System.out.println("Before insertion:");
		print(head);

		head = insertBeforreKthelemnt(head, 10,2);

		System.out.println("After insertion:");
		print(head);

	}

	private static Node insertBeforreKthelemnt(Node head, int val, int k) {
		if (k == 1) {
			return insertHead(head, val);
		}
		Node temp = head;
		int cnt = 0;
		while (temp != null) {
			cnt++;
			if (cnt == k) {
				break;
			}
			temp = temp.next;

		}
		Node prev = temp.back;
		Node newNode = new Node(val, temp, prev);
		prev.next = newNode;
		temp.back = newNode;
		return head;

	}

	private static Node insertHead(Node head, int val) {
		Node newhead = new Node(val, head, null);
		head.back = newhead;
		return newhead;

	}

	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

}
