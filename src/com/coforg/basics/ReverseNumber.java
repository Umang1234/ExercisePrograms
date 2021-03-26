package com.coforg.basics;
import java.util.*;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		/*
		int rev=0;
		while(n!=0)
		{
		rev=rev*10+n%10;
		n=n/10;
		}
		*/
		
		//StringBuffer
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		 */
		
		//StringBuilder
		/*
		StringBuilder sb1 = new StringBuilder();
		sb1.append(n);
		StringBuilder rev = sb1.reverse();
		System.out.println("reverse number is:"+rev);
		 */
	}
}