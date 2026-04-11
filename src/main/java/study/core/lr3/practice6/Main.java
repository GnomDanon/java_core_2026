package study.core.lr3.practice6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество человек");
		int count = in.nextInt();

		List<Integer> list = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		for (int i = 0; i < count; i++) {
			list.add(i);
			linkedList.add(i);
		}

		long listStart = System.currentTimeMillis();
		System.out.println("Вывод для списка: " + findTheLastOne(list));
		long listEnd = System.currentTimeMillis();
		System.out.println("Время работы для списка: " + (listEnd - listStart));

		long linkedStart = System.currentTimeMillis();
		System.out.println("Вывод для связного списка: " + findTheLastOne(linkedList));
		long linkedEnd = System.currentTimeMillis();
		System.out.println("Время работы для связного списка: " + (linkedEnd - linkedStart));
	}

	public static int findTheLastOne(List<Integer> list) {
		int index = 0;
		while (list.size() > 1) {
			index++;
			if (index % 2 == 0) {
				continue;
			}
			list.remove(index % list.size());
		}
		return list.get(0);
	}
}
