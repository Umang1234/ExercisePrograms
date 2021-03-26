package com.coforge.inher;

public class SubBranch extends Branch2 {

	@Override
	void houseLoan() {
		System.out.println("15% hl in kovai");
	}
	
	@Override
	void carLoan() {
		System.out.println("8% cl in kovai");
	}
	void checkPay() {
			System.out.println("in sub");
	}
}
