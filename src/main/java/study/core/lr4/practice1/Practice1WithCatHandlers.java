package study.core.lr4.practice1;

import java.util.Scanner;

public class Practice1WithCatHandlers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("Введите длину массива");
			int length = Integer.parseInt(in.nextLine());
			int total = 0;
			int count = 0;
			for (int i = 0; i < length; i++) {
				System.out.println("Введите значение элемента [" + i + "]: ");
				int value = Integer.parseInt(in.nextLine());
				if (value > 0) {
					total += value;
					count += 1;
				}
			}
			System.out.println("Среднее значение среди положительных элементов массива: " + (total / count));
		} catch (NumberFormatException e) {
			System.out.println("Ошибка: Введен некорректный формат числа");
		} catch (ArithmeticException e) {
			System.out.println("Ошибка: В массиве нет положительных элементов");
		}
	}
}
