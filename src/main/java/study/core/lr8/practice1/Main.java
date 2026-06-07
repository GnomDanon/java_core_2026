package study.core.lr8.practice1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Main {
	private static final String FILE_PATH = "src/main/java/study/core/lr8/practice1/example.xml";

	private static final Document doc = getDocument();
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
				addBook(title, author, year);
				System.out.println("Книга добавлена");
			} else if (line.equals("search")) {
				System.out.println("Введите поисковый запрос:");
				String query = in.nextLine();
				System.out.println(search(query));
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

	private static void addBook(String title, String author, String year) {
		if (doc == null)
			return;

		doc.getDocumentElement().normalize();
		Element library = doc.getDocumentElement();

		Element book = doc.createElement("book");
		library.appendChild(book);

		Element titleEl = doc.createElement("title");
		titleEl.appendChild(doc.createTextNode(title));
		book.appendChild(titleEl);

		Element authorEl = doc.createElement("author");
		authorEl.appendChild(doc.createTextNode(author));
		book.appendChild(authorEl);

		Element yearEl = doc.createElement("year");
		yearEl.appendChild(doc.createTextNode(year));
		book.appendChild(yearEl);

		write();
	}

	private static List<String> search(String query) {
		if (doc == null)
			return new ArrayList<>();

		List<String> result = new ArrayList<>();
		NodeList list = doc.getElementsByTagName("book");
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				if (element.getElementsByTagName("author").item(0).getTextContent().contains(query)
					|| element.getElementsByTagName("year").item(0).getTextContent().contains(query)
				)
					result.add(element.getElementsByTagName("title").item(0).getTextContent());
			}
		}
		return result;
	}

	private static boolean remove(String title) {
		if (doc == null)
			return false;

		NodeList list = doc.getElementsByTagName("book");
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				if (element.getElementsByTagName("title").item(0).getTextContent().equals(title)) {
					element.getParentNode().removeChild(element);
					write();
					return true;
				}
			}
		}

		return false;
	}

	private static Document getDocument() {
		try {
			File inputFile = new File(FILE_PATH);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			return dBuilder.parse(inputFile);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private static void write() {
		if (doc == null)
			return;

		try {
			doc.normalizeDocument();
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(FILE_PATH));
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
