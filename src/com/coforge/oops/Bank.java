package com.coforge.oops;
/*
public class Bank {

	void withdraw(int amount) {
		System.out.println("in bank");
		int balance =1000/amount;
		System.out.println("balance: "+balance);
	}
}
*/
//2
/*
public class Bank {

	void withdraw(int amount) {
		System.out.println("in bank");
		try {
		int balance =1000/amount;
		System.out.println("balance: "+balance);
		} catch(Exception e) {
			System.out.println("error....");
			System.out.println(e.getMessage());
		}
		System.out.println("Server done");
	}
}
*/
//3
/*
public class Bank {

	void withdraw(int amount) {
		System.out.println("in bank");
		try {
		int balance =1000/amount;
		System.out.println("balance: "+balance);
		} catch(Exception e) {
			System.out.println("error....");
			throw e;
			//System.out.println(e.getMessage());
		}
		System.out.println("Server done");
	}
}
*/
//4
/*
public class Bank {

	void withdraw(int amount) {
		System.out.println("in bank");
		try {
		int balance =1000/amount;
		System.out.println("balance: "+balance);
		} catch(Exception e) {
			System.out.println("error....");
			throw e;
			//System.out.println(e.getMessage());
		} finally{
			System.out.println("close resources");
		}
		System.out.println("Server done");
	}
}
*/
//5
/*
public class Bank {

	void withdraw(int amount) throws Exception{
		System.out.println("in bank");
		try {
			if(amount>1000){
				System.out.println("amount is less");
				throw new Exception("Amount should be less tha 0");
				}else {
					int balance =1000 - amount;
					System.out.println("balance "+balance);
				}
		} catch(Exception e) {
			//e.printStackTrace();
			System.out.println("error...."+e.getMessage());
			throw e;
		} finally{
			System.out.println("close resources");
		}
		System.out.println("Server done");
	}
}
*/
