package study.core.lr2.practice7;

public interface BankAccountOperations {

	void createAccount(String owner, double initialBalance);

	void deposit(double amount);

	void withdraw(double amount);

	double getBalance();
}
