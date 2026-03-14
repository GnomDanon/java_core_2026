package study.core.lr2.practice7;

public class BankAccount implements BankAccountOperations {

	private String owner;
	private double balance;

	@Override
	public void createAccount(String owner, double initialBalance) {
		this.owner = owner;
		this.balance = initialBalance;
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Зачислено: " + amount);
		} else {
			System.out.println("Некорректная сумма");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Получено: " + amount);
		} else {
			System.out.println("Некорректная сумма");
		}
	}

	@Override
	public double getBalance() {
		return balance;
	}
}
