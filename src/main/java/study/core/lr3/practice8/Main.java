package study.core.lr3.practice8;

public class Main {
	public static void main(String[] args) {
		checkCreateHead();
		System.out.println();

		checkCreateTail();
		System.out.println();

		checkCreateHeadRec();
		System.out.println();

		checkCreateTailRec();
		System.out.println();

		checkMethods();
	}

	public static void checkCreateHead() {
		SingleLinkedList<Integer> list = SingleLinkedList.createHead(1, 2, 3, 4, 5);
		System.out.println("Вывод списка, созданного с головы: " + list);
	}

	public static void checkCreateTail() {
		SingleLinkedList<Integer> list = SingleLinkedList.createTail(1, 2, 3, 4, 5);
		System.out.println("Вывод списка, созданного с хвоста: " + list);
	}

	public static void checkCreateHeadRec() {
		SingleLinkedList<Integer> list = SingleLinkedList.createHeadRec(1, 2, 3, 4, 5);
		System.out.println("Вывод списка, созданного с головы рекурсивно: " + list.toStringRec());
	}

	public static void checkCreateTailRec() {
		SingleLinkedList<Integer> list = SingleLinkedList.createTailRec(1, 2, 3, 4, 5);
		System.out.println("Вывод списка, созданного с хвоста рекурсивно: " + list.toStringRec());
	}

	public static void checkMethods() {
		SingleLinkedList<Integer> list = SingleLinkedList.createHead(1, 2, 3, 4, 5);
		System.out.println("Вывод списка до модификаций: " + list);

		list.addFirst(0);
		list.addLast(6);
		list.insert(3, 23);
		System.out.println("Вывод списка после добавления элементов: " + list);

		list.removeFirst();
		list.removeLast();
		list.remove(2);
		System.out.println("Вывод списка после удаления элементов: " + list);
	}
}
