package linkedlist.dsa;
//Traversal a Linked list

public class TraversalALinkedList {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);

		traverse(head);
	}

	public static void traverse(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
