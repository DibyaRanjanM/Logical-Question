package linkedlist.dsa;

//Insert one Tail on existing Linked list
public class InsertTail {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);

		traverseLL(head);
		Node inserHead = insertTail(head, 9);
		traverseLL(inserHead);

	}

	public static Node insertTail(Node head, int val) {
		if (head == null) {
			return new Node(val);
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(val);
		temp.next = newNode;
		return head;

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
