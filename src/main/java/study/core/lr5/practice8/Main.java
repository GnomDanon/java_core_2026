package study.core.lr5.practice8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите строку, по которой будет реализован поиск:");
		List<String> data = List.of(in.nextLine().split(" "));
		System.out.println("Введите длину:");
		int length = in.nextInt();

		System.out.println("Найденные строки:");
		System.out.println(Arrays.toString(findByLength(data, length).toArray()));
	}

	public static List<String> findByLength(List<String> list, int length) {
		return list.stream()
				.filter(s -> s.length() > length)
				.collect(Collectors.toList());
	}
}
