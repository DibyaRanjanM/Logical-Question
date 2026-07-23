package com.nt.problem;

public class ListNode {
	int val;

	ListNode next;

	ListNode(int x) {
		val = x;
	}

	public ListNode reverseLinkedlist(ListNode head) {

		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode obj = new ListNode(0);

		ListNode reversedHead = obj.reverseLinkedlist(head);

		while (reversedHead != null) {
			System.out.print(reversedHead.val + " -> ");
			reversedHead = reversedHead.next;
		}

		System.out.println("null");
	}

}
