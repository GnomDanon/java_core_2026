package study.core.lr5.practice6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите строку, по которой будет реализован поиск:");
		List<String> data = List.of(in.nextLine().split(" "));
		System.out.println("Введите поисковый запрос:");
		String query = in.nextLine();

		System.out.println("Найденные строки:");
		System.out.println(Arrays.toString(findBySubstring(data, query).toArray()));
	}

	public static List<String> findBySubstring(List<String> list, String query) {
		return list.stream()
				.filter(s -> s.contains(query))
				.collect(Collectors.toList());
	}
}
