package linkedlist.dsa;
//Implement linked list node insertion before target value
public class InsertEleBeforeValue {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);

		traverseLL(head);

		head = insertEle(head, 10, 5);

		traverseLL(head);

	}

	private static Node insertEle(Node head, int ele, int val) {
		if (head == null) {
			return null;
		}
		if (head.data == val) {
			return new Node(ele, head);
		}
		Node temp = head;
		// boolean found = false;
		while (temp.next != null) {
			if (temp.next.data == val) {
				Node x = new Node(ele, temp.next);
				temp.next = x;
				break;
			}
			temp = temp.next;
		}
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
