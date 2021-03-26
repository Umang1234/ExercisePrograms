package com.coforg.basics;

public class Leap {

	public static void main(String[] args) {
		
		int n=2020;
		if(n%4==0 && n%100==0 && n%400==0)
			System.out.println("Leap yr");
		else
			System.out.println("Not a leap yr");
	}

}
