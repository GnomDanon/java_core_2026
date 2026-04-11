package study.core.lr3.comparing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
	private static final int ITEMS_COUNT = 5_000_000;

	public static void main(String[] args) {
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayList<Integer> list = new ArrayList<>();
		TreeSet<Integer> set = new TreeSet<>();

		long start;
		long end;

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.addFirst(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayDeque, добавление в начало коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.add(0, i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, добавление в начало коллекции: " + (end - start));

		System.out.println("TreeSet, добавление в начало коллекции: не предусмотрено");

		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.removeFirst();
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayDeque, удаление в начале коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.remove(0);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, удаление в начале коллекции: " + (end - start));

		System.out.println("TreeSet, удаление в начале коллекции: не предусмотрено");

		deque.clear();
		list.clear();
		set.clear();
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.addLast(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayDeque, добавление в конец коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, добавление в конец коллекции: " + (end - start));

		System.out.println("TreeSet, добавление в конец коллекции: не предусмотрено");

		System.out.println();

		System.out.println("ArrayDeque, получение элемента по индексу: не предусмотрено");

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, получение элемента по индексу: " + (end - start));

		System.out.println("TreeSet, получение элемента по индексу: не предусмотрено" + (end - start));

		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.removeLast();
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayDeque, удаление элемента в конце коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.remove(list.size() - 1);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, удаление элемента в конце коллекции: " + (end - start));

		System.out.println("TreeSet, удаление элемента в конце: не предусмотрено");

		deque.clear();
		list.clear();
		set.clear();
		System.out.println();

		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.add(i);
		}
		System.out.println("ArrayDeque, добавление в середину коллекции: не поддерживается");

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.add(i / 2, i);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, добавление в середину коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			set.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("TreeSet, добавление в середину коллекции: " + (end - start));

		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			deque.remove(deque.size() / 2);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayDeque, удаление в середине коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			list.remove(list.size() / 2);
		}
		end = System.currentTimeMillis();
		System.out.println("ArrayList, удаление в середине коллекции: " + (end - start));

		start = System.currentTimeMillis();
		for (int i = 0; i < ITEMS_COUNT; i++) {
			set.remove(set.size() / 2);
		}
		end = System.currentTimeMillis();
		System.out.println("TreeSet, удаление в середине коллекции: " + (end - start));
	}
}
