package com.coforge.inher;

public class Savings extends Account {
	
	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(int amount) {
		System.out.println("Savings Withdraw");
		balance=balance-amount-100;
		//super.withdraw(amount);
	}

	@Override
	void deposit(int amount) {
		System.out.println("Current Withdraw");
		balance=balance-amount+100;
		//super.deposit(amount);
	}

}
