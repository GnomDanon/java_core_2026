package study.core.lr8.practice4;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Введите путь к Excel-файлу: ");
			String filePath = scanner.nextLine();

			try (FileInputStream inputStream = new FileInputStream(filePath);
				 XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

				String sheetName = "Товары";
				XSSFSheet sheet = workbook.getSheet(sheetName);

				if (sheet == null) {
					System.out.println("Ошибка: лист \"" + sheetName + "\" не найден.");
					System.out.println("Проверьте название листа в Excel-файле.");
					continue;
				}

				System.out.println("\nСодержимое листа \"" + sheetName + "\":");

				sheet.forEach(row -> {
					row.forEach(cell ->
							System.out.print(cell.toString() + "\t"));
					System.out.println();
				});

				System.out.println("\nФайл успешно обработан.");
				break;

			} catch (FileNotFoundException e) {
				System.out.println("Ошибка: файл не найден.");
				System.out.println("Проверьте правильность пути к файлу.");

			} catch (org.apache.poi.EmptyFileException e) {
				System.out.println("Ошибка: файл пуст.");
				System.out.println("Выберите корректный Excel-файл.");

			} catch (IOException e) {
				System.out.println("Ошибка чтения файла.");
				System.out.println("Убедитесь, что файл имеет формат .xlsx и не поврежден.");
				System.out.println("Подробности: " + e.getMessage());

			} catch (Exception e) {
				System.out.println("Неожиданная ошибка: " + e.getMessage());
			}

			System.out.println("\nИсправьте проблему и попробуйте снова.\n");
		}

		scanner.close();
	}
}
