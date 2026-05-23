package study.core.lr7.practice7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите текст для записи в файл: ");
		int totalCount = 0;
		String line;

		try (PrintWriter writer = new PrintWriter("src/main/java/study/core/lr7/practice7/output.txt")){
			while ((line = in.nextLine()) != null && !line.isEmpty()) {
				totalCount += line.length();
				writer.write(line + "\n");
			}
		}

		System.out.println("Количество записанных символов: " + totalCount);
	}
}
