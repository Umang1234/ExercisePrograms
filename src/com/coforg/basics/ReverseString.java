package com.coforg.basics;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="ABCD";
		String rev="";
		
		//1. Using + (String concatenation operator)
		/*
		int len =str.length(); //4
		for(int i=len-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+str.charAt(i); //DCBA
		}
		System.out.println("Reversed String is "+rev);	
		*/
		
		//2. Using Character Array
		/*
		char a[]=str.toCharArray();
		int len =a.length; //4
		for(int i=len-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+a[i]; //DCBA
		}
		System.out.println("Reversed String is "+rev);	
		*/
		
		//3. Using StringBuffer class
		/*
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());	
		*/	
	}
}
