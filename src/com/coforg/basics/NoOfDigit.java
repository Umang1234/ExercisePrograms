package com.coforg.basics;

public class NoOfDigit {

	public static void main(String[] args) {

		int n=123456, c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		System.out.println("Number of digits is "+c);
		
	}
}
