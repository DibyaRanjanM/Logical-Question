package linkedlist.dsa;

//Implement node insertion at specified position in linked list
public class InsertaValueinLL {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(4);
		head.next.next = new Node(5);
		head.next.next.next = new Node(7);

		traverseLL(head);

		head = insertPosition(head, 3, 10);

		traverseLL(head);
	}

	private static Node insertPosition(Node head, int k, int el) {
		if (head == null) {
			if (k == 1) {
				return new Node(el);
			} else {
				return head;
			}
		}

		if (k == 1) {
			return new Node(el, head);
		}

		int cnt = 1;
		Node temp = head;

		while (temp != null) {
			if (cnt == k - 1) {
				Node x = new Node(el, temp.next);
				temp.next = x;
				break;
			}

			cnt++;
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
