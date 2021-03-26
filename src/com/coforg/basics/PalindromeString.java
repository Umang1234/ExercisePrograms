package com.coforg.basics;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		String str1=str;
		String rev="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("rev is "+rev);
		if(str1.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
