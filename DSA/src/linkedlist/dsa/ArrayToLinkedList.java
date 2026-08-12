package linkedlist.dsa;

public class ArrayToLinkedList {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 5, 7 };
		Node convertArrayToLinkedList = convertArrayToLinkedList(arr);
		System.out.println(convertArrayToLinkedList.data);

	}

	public static Node convertArrayToLinkedList(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;

		}
		return head;
	}

}
