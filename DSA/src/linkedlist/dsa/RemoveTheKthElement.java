package linkedlist.dsa;

public class RemoveTheKthElement {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);

		System.out.print("Original List: ");
		traverse(head);

		head = removeK(head, 1);

		System.out.print("After Deleting 3rd Element: ");
		traverse(head);
	}

	public static Node removeK(Node head, int k) {
		if (head == null)
			return head;
		if (k == 1) {
			// Node temp = head;
			return head.next;
		}
		int count = 0;
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			count++;
			if (count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static void traverse(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;

		}
		System.out.println();

	}

}
