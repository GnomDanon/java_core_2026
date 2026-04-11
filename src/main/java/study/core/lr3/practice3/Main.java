package study.core.lr3.practice3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите длину массива: ");
		int[] array = new int[in.nextInt()];

		fill(array, 0, in);
		out(array, 0);
	}

	public static void fill(int[] array, int index, Scanner scanner) {
		if (index == array.length) {
			return;
		}

		System.out.println("Введите элемент [" + index + "]: ");
		array[index] = scanner.nextInt();

		fill(array, ++index, scanner);
	}

	public static void out(int[] array, int index) {
		if (index == array.length) {
			return;
		}

		System.out.print(array[index] + " ");
		out(array, ++index);
	}
}
