package com.coforg.basics;

public class CountEvenOddDigit {

	public static void main(String[] args) {

		int n=12345679, c=0,d=0;
		while(n>0)
		{
			if(n%2==0)
			{
			n=n/10;
			c++;
			}
			else if(n%2!=0)
			{
				n=n/10;
				d++;
			}
		}
		System.out.println("Even is "+c);
		System.out.println("Odd is "+d);
	}
}
