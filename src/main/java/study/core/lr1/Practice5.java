package study.core.lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите год Вашего рождения:");
		int year = in.nextInt();

		System.out.printf("Ваш возраст: %d", LocalDate.now().getYear() - year);

		in.close();
	}
}
