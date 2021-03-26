package com.coforge.inher;

public class Account {

	double balance;
	public Account(double balance) {
		super();
		this.balance=balance;
	}
	void withdraw(int amount) {
		System.out.println("In ABC Bank Withdraw");
	}
	void deposit(int amount) {
		System.out.println("In ABC Bank Deposit");
	}
	double getBalance() {
		return balance;
	}
}
