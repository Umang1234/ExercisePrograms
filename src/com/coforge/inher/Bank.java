package com.coforge.inher;

public abstract class Bank {

	abstract void carLoan();
	abstract void eduLoan();
	abstract void houseLoan();
	static void admin() {
		System.out.println("Admin Details");
	}
}
