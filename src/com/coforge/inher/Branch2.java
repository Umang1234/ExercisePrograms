package com.coforge.inher;

public abstract class Branch2 extends Bank {

	@Override
	void carLoan() {
		System.out.println("17% cl in ooty");
	}

	@Override
	void eduLoan() {
		System.out.println("10% el in ooty");
	}

	void checkDeposit() {
		System.out.println("In Branch2 deposit");
	}

}
