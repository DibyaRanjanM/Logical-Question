package linkedlist.dsa;

public class LengthOfaLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(56);
		int lengthOfaLinkedlist = lengthOfaLinkedlist(head);
		System.out.println(lengthOfaLinkedlist);

	}

	public static int lengthOfaLinkedlist(Node head) {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			// count = temp.data;
			temp = temp.next;
			count++;
		}
		return count;

	}

}
