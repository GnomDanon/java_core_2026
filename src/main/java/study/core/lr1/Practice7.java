package study.core.lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите Ваш возраст:");
		int age = in.nextInt();

		System.out.printf("Год Вашего рождения: %d", LocalDate.now().getYear() - age);

		in.close();
	}
}
