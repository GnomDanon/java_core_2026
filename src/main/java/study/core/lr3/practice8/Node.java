package study.core.lr3.practice8;

public class Node<T> {
	private T value;
	private Node<T> next;

	protected Node() {}

	protected Node(T value) {
		this.value = value;
	}

	protected Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}

	protected T getValue() {
		return value;
	}

	protected Node<T> getNext() {
		return next;
	}

	protected boolean hasNext() {
		return next != null;
	}

	protected void setNext(Node<T> next) {
		this.next = next;
	}
}
