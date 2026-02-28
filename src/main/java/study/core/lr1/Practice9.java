package study.core.lr1;

import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите число:");
		int current = in.nextInt();

		int previous = current - 1;
		int next = current + 1;
		int sum = previous + current + next;
		int square = sum * sum;

		System.out.printf("Последовательность чисел: %d %d %d %d", previous, current, next, square);

		in.close();
	}
}
