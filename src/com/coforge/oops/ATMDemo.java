package com.coforge.oops;
import java.util.*;

class NBank{
	int balance;

	public NBank(int balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(int amount) throws OutOfLimitsException, NegBalException{
		try {
		if((balance-amount)<=0) {
			throw new NegBalException("balance is negative");
		}else if(amount>5000) {
			throw new OutOfLimitsException("Amount should be less than 5000");
		}else {
			balance = balance-amount;
			System.out.println(balance);
		}
		}catch(OutOfLimitsException e) {
			System.out.println(e.getMessage());
			throw e;
		}catch(NegBalException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
}
public class ATMDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		System.out.println("amount"+amount);
		NBank bank = new NBank(9000);
		try {
			bank.withdraw(amount);
			System.out.println("Amount Withdrawn");
		} catch(OutOfLimitsException e) {
			System.out.println(e.getMessage());
		}catch(NegBalException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("GoodBye");
	}
}
