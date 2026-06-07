package study.core.lr8.practice3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	private static final int MAX_RETRIES = 3;

	public static void main(String[] args) {
		String url = "https://itlearn.ru/first-steps";
		String fileName = "src/main/java/study/core/lr8/practice3/links.txt";

		Document doc = null;
		int attempt = 0;

		while (attempt < MAX_RETRIES) {
			try {
				System.out.println("Попытка подключения №" + (attempt + 1));

				doc = Jsoup.connect(url)
						.timeout(10000)
						.get();

				System.out.println("Подключение успешно!");
				break;

			} catch (IOException e) {
				attempt++;
				System.out.println("Ошибка подключения: " + e.getMessage());

				if (attempt < MAX_RETRIES) {
					System.out.println("Повторная попытка через 3 секунды...");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException ex) {
						Thread.currentThread().interrupt();
					}
				} else {
					System.out.println("Не удалось подключиться после "
							+ MAX_RETRIES + " попыток.");
					return;
				}
			}
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

			Elements links = doc.select("a[href]");

			for (Element link : links) {
				String href = link.attr("abs:href");

				System.out.println(href);
				writer.write(href);
				writer.newLine();
			}

			System.out.println("Ссылки успешно сохранены в файл: " + fileName);

		} catch (IOException e) {
			System.out.println("Ошибка записи в файл: " + e.getMessage());
		}
	}
}
