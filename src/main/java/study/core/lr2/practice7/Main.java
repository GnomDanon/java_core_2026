package study.core.lr2.practice7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		BankAccount account = new BankAccount();

		System.out.println("Введите имя:");
		account.createAccount(in.next(), 0);

		System.out.println("Введите сумму для внесения депозита:");
		account.deposit(in.nextInt());

		System.out.println("Введите сумма для снятия:");
		account.withdraw(in.nextInt());

		System.out.println("Текущий баланс: " + account.getBalance());
	}
}