package study.core.lr4.practice3;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите длину массива");
		int length = Integer.parseInt(in.nextLine());
		int total = 0;
		for (int i = 0; i < length; i++) {
			System.out.println("Введите значение элемента [" + i + "]: ");
			total += Byte.parseByte(in.nextLine());
		}
		System.out.println("Сумма элементов массива: " + total);
	}
}

