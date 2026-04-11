package study.core.lr3.practice2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(bin(in.nextInt()));
	}

	public static String bin(int number) {
		if (number == 0 || number == 1) {
			return String.valueOf(number);
		}
		return bin(number / 2) + bin(number % 2);
	}
}
