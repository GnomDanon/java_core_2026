package study.core.lr1;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите первое число:");
		int a = in.nextInt();

		System.out.println("Введите второе число:");
		int b = in.nextInt();

		System.out.printf("Сумма чисел: %d, разность чисел: %d", a + b, a - b);

		in.close();
	}
}
