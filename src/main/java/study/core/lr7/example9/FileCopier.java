package study.core.lr7.example9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("src/main/java/study/core/lr7/example9/input.txt");
		FileWriter writer = new FileWriter("src/main/java/study/core/lr7/example9/output.txt");
		int c;
		while ((c = reader.read()) != -1) {
			writer.write(c);
		}
		reader.close();
		writer.close();
		System.out.println("Файл скопирован успешно!");
	}
}
