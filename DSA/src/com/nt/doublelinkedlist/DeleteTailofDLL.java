package com.nt.doublelinkedlist;

//Delete the Tail
public class DeleteTailofDLL {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 7 };

		Node head = convertArray2Dll(arr);

		System.out.println("Original DLL:");
		print(head);

		head = deleteTail(head);

		System.out.println("After deleting head:");
		print(head);
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
	}

}
