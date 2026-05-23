package study.core.lr7.practice8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Ivan Ivanov", 1000);

		try {
			FileOutputStream fileOut = new FileOutputStream("src/main/java/study/core/lr7/practice8/person.json");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(account);
			out.close();
			fileOut.close();

			FileInputStream fileInput = new FileInputStream("src/main/java/study/core/lr7/practice8/person.json");
			ObjectInputStream input = new ObjectInputStream(fileInput);
			BankAccount accountFromFile = (BankAccount) input.readObject();
			System.out.printf("Owner: %s, balance: %d", accountFromFile.getOwner(), accountFromFile.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
