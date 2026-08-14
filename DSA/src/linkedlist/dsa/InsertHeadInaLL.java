package linkedlist.dsa;

public class InsertHeadInaLL {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);

		traverseLL(head);
		Node inserHead = inserHead(head, 3);
		traverseLL(inserHead);

	}

	public static Node inserHead(Node head, int ele) {
		return new Node(ele, head);

	}

	private static void traverseLL(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

}
