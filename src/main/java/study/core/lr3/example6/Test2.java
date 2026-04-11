package study.core.lr3.example6;

public class Test2 {
	public static void main(String[] args) {
		Node head = null;
		for (int i = 9; i >= 0; i--) {
			head = new Node(i, head);
		}

		Node ref = head;
		while (ref != null) {
			System.out.print(" " + ref.value);
			ref = ref.next;
		}
	}

	public static Node insert(Node head) {
		return new Node(0, head);
	}

	public static void add(Node head) {
		Node newTail = new Node(123, null);
		Node ref = head;

		while (ref.next != null) {
			ref = ref.next;
		}

		ref.next = newTail;
	}

	public static void insertAt(Node head) {
		Node newNode = new Node(44, null);
		Node ref = head;
		int k = 1;

		while (ref.next != null && k < 2) {
			ref = ref.next;
			k++;
		}

		newNode.next = ref.next;
		ref.next = newNode;
	}

	public static Node remove(Node head) {
		return head.next;
	}

	public static void pop(Node head) {
		Node ref = head;

		while (ref.next.next != null) {
			ref = ref.next;
		}

		ref.next = null;
	}

	public static void removeAt(Node head) {
		Node ref = head;
		int k = 1;

		while (ref.next != null && k < 2) {
			ref = ref.next;
			k++;
		}

		ref.next = ref.next.next;
	}
}
