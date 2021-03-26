package com.coforg.basics;

public class Palindrome {

	public static void main(String[] args) {
		int n=12321,rev=0;
		int m=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("rev is "+rev);
		if(m==rev)
			System.out.println("palindrome");
		else
			System.out.println("not Palindrome");
	}
}
