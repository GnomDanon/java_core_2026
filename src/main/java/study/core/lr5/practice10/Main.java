package study.core.lr5.practice10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите строку, по которой будет реализован поиск:");
		List<String> data = List.of(in.nextLine().split(" "));

		System.out.println("Найденные строки:");
		System.out.println(Arrays.toString(findLetters(data).toArray()));
	}

	public static List<String> findLetters(List<String> list) {
		return list.stream()
				.filter(s -> s.chars().allMatch(Character::isLetter))
				.collect(Collectors.toList());
	}
}
