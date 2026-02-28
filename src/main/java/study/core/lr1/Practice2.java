package study.core.lr1;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input first name:");
		String firstName = in.nextLine();

		System.out.println("Input age:");
		int age = in.nextInt();

		System.out.printf("Name: %s, Age: %d", firstName, age);

		in.close();
	}
}
