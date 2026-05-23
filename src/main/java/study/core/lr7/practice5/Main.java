package study.core.lr7.practice5;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите путь до файла: ");
		String fileName = in.nextLine();

		File file = new File(fileName);
		if (file.exists()) {
			System.out.println("Размер файла: " + file.length() + " байт");
		} else {
			System.out.println("Файл не существует");
		}

		in.close();
	}
}
