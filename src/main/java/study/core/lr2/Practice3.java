package study.core.lr2;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите текст для шифрования");
		String str = in.nextLine();

		System.out.println("Введите ключ");
		int shift = in.nextInt();

		String encryptedString = encrypt(str, shift);
		System.out.println("Текст после преобразования: " + encryptedString);
		System.out.println("Выполнить преобразование? (y/n)");

		while (true) {
			String answer = in.next();

			if (answer.equals("y")) {
				System.out.println("Текст после обратного преобразования: " + encrypt(encryptedString, -shift));
				return;
			} else if (answer.equals("n")) {
				System.out.println("До свидания!");
				return;
			} else {
				System.out.println("Введите корректный ответ");
			}
		}
	}

	public static String encrypt(String encryptString, int shift) {
		char[] arrayChar = encryptString.toCharArray();
		char[] arrayCharNew = new char[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			arrayCharNew[i] = (char) (arrayChar[i] + shift);
		}
		return new String(arrayCharNew);
	}
}
