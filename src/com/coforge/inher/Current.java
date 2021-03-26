package com.coforge.inher;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
	}
	
	@Override
	void withdraw(int amount) {
	//	super.withdraw(amount);
		System.out.println("Current Withdraw");
		balance=balance-amount;
	}

	@Override
	void deposit(int amount) {
		super.deposit(amount);
		System.out.println("Current Deposit");
		balance=balance+amount;
	}
	void checkInterest() {
		System.out.println("Checking Interest");
	}
}
