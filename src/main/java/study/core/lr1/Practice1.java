package study.core.lr1;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input last name: ");
		String lastName = in.nextLine();

		System.out.println("Input first name: ");
		String firstName = in.nextLine();

		System.out.println("Input middleName: ");
		String middleName = in.nextLine();

		System.out.printf("Hello %s %s %s", lastName, firstName, middleName);

		in.close();
	}
}
