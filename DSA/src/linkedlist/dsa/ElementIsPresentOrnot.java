package linkedlist.dsa;

public class ElementIsPresentOrnot {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(8);
		head.next.next = new Node(9);
		int presentOrNot = presentOrNot(head, 8);
		System.out.println(presentOrNot);

	}

	public static int presentOrNot(Node head, int val) {
		Node temp = head;
		while (temp != null) {
			if (temp.data == val) {
				return 1;
			}
			temp = temp.next;

		}
		return 0;
	}

}
