package study.core.lr7.practice8;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private String owner;
	private int balance;

	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}
}
