package linkedlist.dsa;
//Delete The head of LinkedList
public class DeleteHeadOfLL {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);

		System.out.print("Original List: ");
		traverse(head);

		Node removeHead = removeHead(head);

		System.out.print("After Deleting Head: ");
		traverse(removeHead);

		System.out.println("New Head = " + removeHead.data);
	}

	private static Node removeHead(Node head) {
		if (head == null)
			return null;

		return head.next;
	}

	private static void traverse(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}