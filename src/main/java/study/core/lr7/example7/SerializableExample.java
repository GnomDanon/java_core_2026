package study.core.lr7.example7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String[] args) {
		Person person = new Person("Ivan Ivanov", 30);

		try {
			FileOutputStream fileOut = new FileOutputStream("src/main/java/study/core/lr7/example7/person.json");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in person.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
