package study.core.lr7.practice6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		System.out.println("Введите путь до файла: ");
		String fileName = in.nextLine();

		System.out.println("Введите поисковый запрос: ");
		String query = in.nextLine();

		BufferedReader reader = new BufferedReader(new FileReader(fileName));

		String line;
		while ((line = reader.readLine()) != null) {
			if (line.contains(query)) {
				System.out.println(line);
			}
		}

		reader.close();
		in.close();
	}
}
