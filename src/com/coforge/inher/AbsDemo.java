package com.coforge.inher;

public class AbsDemo {
	public static void main(String[] args) {

		Bank bank = new Branch1();
		bank.admin();
		branch1.admin();
		
//		bank = new SubBranch();
//		bank.carLoan();
//		bank.eduLoan();
//		bank.houseLoan();
//		bank.admin();
//		
//		Branch1 branch1 = (Branch1) bank;
//		branch1.payInterest();
//		
//		Branch2 branch2 = (Branch2) bank;
//		branch2.checkDeposit();
//		
//		SubBranch sub = (SubBranch) bank;
//		sub.checkPay();
//		
//		System.out.println(Bank.discount);
//		System.out.println(Branch1.discount);
//		
	}

}
