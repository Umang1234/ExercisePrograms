package com.coforg.basics;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter ");
		int n=sc.nextInt();
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0) 
			{
			count+=1;
			}
		}
		if(count>0) 
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		sc.close();
	}
}