package study.core.lr4.practice3;

import java.util.Scanner;

public class Practice2WithCatHandlers {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);

			System.out.println("Введите длину массива");
			int length = Integer.parseInt(in.nextLine());
			int total = 0;
			for (int i = 0; i < length; i++) {
				System.out.println("Введите значение элемента [" + i + "]: ");
				total += Byte.parseByte(in.nextLine());
			}
			System.out.println("Сумма элементов массива: " + total);
		} catch (NumberFormatException e) {
			System.out.println("Ошибка: Введен некорректный формат числа");
		}
	}
}
