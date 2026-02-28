package study.core.lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите Ваше имя:");
		String name = in.nextLine();

		System.out.println("Введите год Вашего рождения:");
		int year = in.nextInt();

		System.out.printf("Ваше имя: %s, Ваш возраст: %d", name, LocalDate.now().getYear() - year);

		in.close();
	}
}
