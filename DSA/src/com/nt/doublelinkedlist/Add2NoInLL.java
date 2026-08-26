package com.nt.doublelinkedlist;

/*
 * 
 * 
 * 
 * Add two numbers in Linked List
Subscribe to TUF+

Hints
Company
Given two non-empty linked lists linkedList1 and linkedList2 which represent two non-negative integers.



The digits are stored in reverse order with each node storing one digit.

Add two numbers and return the sum as a linked list.



The sum Linked List will be in reverse order as well.


The Two given Linked Lists represent numbers without any leading zeros, except when the number is zero itself.

Example 1

Input: linkedList1 = [5, 4], linkedList2 = [4]

Output: [9, 4]

Explanation: linkedList1 = 45, linkedList2 = 4.

linkedList1 + linkedList2 = 45 + 4 = 49.

The sum is 49 and when prepare the linked list we reverse the number [9, 4]

Example 2

Input: linkedList1 = [4, 5, 6], linkedList2 = [1, 2, 3]

Output: [5, 7, 9]

Explanation: linkedList1 = 654, linkedList2 = 321.

linkedList1 + linkedList2 = 654 + 321 = 975.

The sum is 975 and when prepare the linked list we reverse the number [5, 7, 9]The sum

Now your turn!

Input: linkedList1 = [1], linkedList2 = [8, 7]
 */
public class Add2NoInLL {
	public static void main(String[] args) {

		Node head1 = new Node(5);
		head1.next = new Node(4);

		Node head2 = new Node(4);

		Node result = addTwoNumber(head1, head2);
		print(result);

	}

	private static Node addTwoNumber(Node head1, Node head2) {

		Node dummyHead = new Node(-1);
		Node current = dummyHead;

		Node temp1 = head1;
		Node temp2 = head2;

		int carry = 0;

		while (temp1 != null || temp2 != null || carry != 0) {

			int sum = carry;

			if (temp1 != null) {
				sum += temp1.data;
				temp1 = temp1.next;
			}

			if (temp2 != null) {
				sum += temp2.data;
				temp2 = temp2.next;
			}

			Node newNode = new Node(sum % 10);

			carry = sum / 10;

			current.next = newNode;
			current = current.next;
		}

		return dummyHead.next;
	}

	private static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
}
