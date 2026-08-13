package linkedlist.dsa;
//Remove Tail
public class DeleteLinkedlistTail {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(7);
		head.next.next.next = new Node(9);

		System.out.print("Original List: ");
		traverseLL(head);

		head = deletestail(head);

		System.out.print("After Deleting Tail: ");
		traverseLL(head);
	}

	private static Node deletestail(Node head) {
		if (head == null || head.next == null)
			return null;
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

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
