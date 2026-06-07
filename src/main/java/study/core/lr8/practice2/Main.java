package study.core.lr8.practice2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final String filePath = "src/main/java/study/core/lr8/practice2/example.json";

	private static final JSONObject json = read();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.println("Какое действие Вы хотите совершить?");
			System.out.println("- add - Добавить книгу");
			System.out.println("- search - Найти книгу");
			System.out.println("- remove - Удалить книгу");
			System.out.println("- exit - Выйти");

			String line = in.nextLine();
			if (line.equals("add")) {
				System.out.println("Введите название книги:");
				String title = in.nextLine();
				System.out.println("Введите автора книги:");
				String author = in.nextLine();
				System.out.println("Введите год издания:");
				String year = in.nextLine();
				add(title, author, year);
				System.out.println("Книга добавлена");
			} else if (line.equals("search")) {
				System.out.println("Введите имя автора:");
				String author = in.nextLine();
				System.out.println(search(author));
			} else if (line.equals("remove")) {
				System.out.println("Введите название книги:");
				String title = in.nextLine();
				boolean removed = remove(title);
				System.out.println(removed ? "Книга удалена" : "Книга не найдена");
			} else if (line.equals("exit")) {
				break;
			}

			System.out.println();
		}
	}

	private static void add(String title, String author, String year) {
		if (json == null)
			return;

		JSONArray books = (JSONArray) json.get("books");

		JSONObject book = new JSONObject();
		book.put("title", title);
		book.put("author", author);
		book.put("year", year);

		books.add(book);
		write(json);
	}

	private static boolean remove(String title) {
		if (json == null)
			return false;

		JSONArray books = (JSONArray) json.get("books");
		Iterator iterator = books.iterator();
		while (iterator.hasNext()) {
			JSONObject book = (JSONObject) iterator.next();
			if (title.equals(book.get("title"))) {
				iterator.remove();
				write(json);
				return true;
			}
		}

		return false;
	}

	private static List<String> search(String author) {
		if (json == null)
			return new ArrayList<>();

		JSONArray books = (JSONArray) json.get("books");
		return books.stream()
				.filter(book -> book instanceof JSONObject)
				.filter(book -> author.equals(((JSONObject)book).get("author")))
				.map(book -> ((JSONObject)book).get("title"))
				.toList();
	}

	private static JSONObject read() {
		try {
			JSONParser parser = new JSONParser();
			return (JSONObject) parser.parse(new FileReader(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static void write(JSONObject json) {
		try (FileWriter file = new FileWriter(filePath)) {
			file.write(json.toJSONString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
