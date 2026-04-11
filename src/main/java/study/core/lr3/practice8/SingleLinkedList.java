package study.core.lr3.practice8;

public class SingleLinkedList<T> {
	private Node<T> head;

	private Node<T> getHead() {
		return head;
	}

	private SingleLinkedList<T> setHead(Node<T> head) {
		this.head = head;
		return this;
	}

	@Override
	public String toString() {
		Node<T> ref = getHead();
		if (ref == null) {
			return "";
		}

		StringBuilder result = new StringBuilder(ref.getValue().toString());
		while (ref.hasNext()) {
			ref = ref.getNext();
			result.append(" ").append(ref.getValue().toString());
		}
		return result.toString();
	}

	public String toStringRec() {
		return toStringRec(getHead(), new StringBuilder());
	}

	private String toStringRec(Node<T> ref, StringBuilder result) {
		result.append(" ").append(ref.getValue().toString());
		if (ref.hasNext()) {
			toStringRec(ref.getNext(), result);
		}
		return result.toString();
	}

	public void addFirst(T value) {
		Node<T> head = getHead();
		setHead(new Node<>(value, head));
	}

	public void addLast(T value) {
		Node<T> ref = getHead();
		if (ref == null) {
			setHead(new Node<>(value));
			return;
		}

		while (ref.hasNext()) {
			ref = ref.getNext();
		}
		ref.setNext(new Node<>(value));
	}

	public void insert(int index, T value) {
		Node<T> ref = getHead();
		Node<T> node = new Node<>(value);
		int i = 0;
		while (ref.hasNext() && i < index - 1) {
			ref = ref.getNext();
			i++;
		}

		if (ref.hasNext()) {
			node.setNext(ref.getNext());
		}

		ref.setNext(node);
	}

	public void removeFirst() {
		setHead(head.getNext());
	}

	public void removeLast() {
		Node<T> ref = getHead();
		while (ref.hasNext() && ref.getNext().hasNext()) {
			ref = ref.getNext();
		}
		ref.setNext(null);
	}

	public void remove(int index) {
		Node<T> ref = getHead();
		int i = 0;
		while (ref.hasNext() && i < index - 1) {
			ref = ref.getNext();
			i++;
		}

		if (i == index - 1) {
			ref.setNext(ref.hasNext() && ref.getNext().hasNext() ? ref.getNext().getNext() : null);
		}
	}

	public static <T> SingleLinkedList<T> createHead(T... values) {
		SingleLinkedList<T> list = new SingleLinkedList<>();

		if (values.length == 0) {
			return list;
		}

		int i = 0;
		Node<T> head = new Node<>(values[i++]);
		Node<T> ref = head;
		for (; i < values.length; i++) {
			Node<T> next = new Node<>(values[i]);
			ref.setNext(next);
			ref = next;
		}

		return list.setHead(head);
	}

	public static <T> SingleLinkedList<T> createTail(T... values) {
		SingleLinkedList<T> list = new SingleLinkedList<>();

		if (values.length == 0) {
			return list;
		}

		int i = 0;
		Node<T> ref = new Node<>(values[i++]);
		for (; i < values.length; i++) {
			Node<T> prev = new Node<>(values[i]);
			prev.setNext(ref);
			ref = prev;
		}

		return list.setHead(ref);
	}

	public static <T> SingleLinkedList<T> createHeadRec(T... values) {
		SingleLinkedList<T> list = new SingleLinkedList<>();
		Node<T> ref = new Node<>();
		createHeadRec(ref, 0, values);
		return list.setHead(ref.hasNext() ? ref.getNext() : ref);
	}

	private static <T> void createHeadRec(Node<T> ref, int index, T... values) {
		if (index == values.length) {
			return;
		}
		Node<T> next = new Node<>(values[index]);
		ref.setNext(next);
		createHeadRec(next, index + 1, values);
	}

	public static <T> SingleLinkedList<T> createTailRec(T... values) {
		SingleLinkedList<T> list = new SingleLinkedList<>();
		return list.setHead(createTailRec(null, 0, values));
	}

	private static <T> Node<T> createTailRec(Node<T> ref, int index, T... values) {
		if (ref == null) {
			return createTailRec(new Node<>(values[index]), index + 1, values);
		}
		if (index == values.length) {
			return ref;
		}
		Node<T> prev = new Node<>(values[index]);
		prev.setNext(ref);
		return createTailRec(prev, index + 1, values);
	}
}
