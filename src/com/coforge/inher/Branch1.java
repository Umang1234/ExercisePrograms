package com.coforge.inher;

public class Branch1 extends Bank {
	@Override
	void carLoan() {
		System.out.println("3% cl in Ban");
	}
	@Override
	void eduLoan() {
		System.out.println("7% el in ban");
	}
	@Override
	void houseLoan() {
		System.out.println("8% hl in ban");
	}
	public void payInterest() {
		System.out.println("Interest in branch1");
	}
	static void admin() {
		System.out.println("Admin Details");
	}
}
