package study.core.lr5.practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		System.out.println("Введите размер списка чисел:");
		int size = in.nextInt();

		System.out.println("Введите список чисел:");
		for (int i = 0; i < size; i++) {
			list.add(in.nextInt());
		}

		System.out.println("Введите максимальное значение:");
		int max = in.nextInt();

		System.out.println("Найденные числа:");
		System.out.println(Arrays.toString(findByMax(list, max).toArray()));
	}

	public static List<Integer> findByMax(List<Integer> list, int max) {
		return list.stream()
				.filter(x -> x < max)
				.collect(Collectors.toList());
	}
}
