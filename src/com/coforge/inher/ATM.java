package com.coforge.inher;

public class ATM {

	public static void main(String[] args) {

		Account account = new Savings(9000);
		account.withdraw(300);
		System.out.println("Balance "+account.getBalance());
		account.deposit(5000);
		System.out.println("Balance "+account.getBalance());
		
		account = new Current(9000);
		account.withdraw(300);
		System.out.println("Balance "+account.getBalance());
		account.deposit(5000);
		System.out.println("Balance "+account.getBalance());
		
		Current current = (Current)account;
		current.checkInterest();
		
		Savings sav = (Savings)account;
		sav.deposit(100);
	}
}
