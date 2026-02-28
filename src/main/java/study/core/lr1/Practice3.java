package study.core.lr1;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите название текущего дня недели:");
		String dayOfWeek = in.nextLine();

		System.out.println("Введите название текущего месяца:");
		String month = in.nextLine();

		System.out.println("Введите текущую дату:");
		int day = in.nextInt();

		System.out.printf("Текущая дата: %s %d, %s", month, day, dayOfWeek);

		in.close();
	}
}
