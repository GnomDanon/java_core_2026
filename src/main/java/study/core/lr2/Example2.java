package study.core.lr2;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите строку");
		String str = in.nextLine();

		System.out.println("Введите величину сдвига");
		int shift = in.nextInt();

		System.out.println("Преобразованная строка: " + getEncryptString(str, shift));
	}

	public static String getEncryptString(String encryptString, int shift) {
		char[] arrayChar = encryptString.toCharArray();
		long[] arrayInt = new long[arrayChar.length];
		char[] arrayCharNew = new char[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			arrayInt[i] = arrayChar[i] + shift;
			arrayCharNew[i] = (char) arrayInt[i];
		}
		encryptString = new String(arrayCharNew);

		return encryptString;
	}
}
