package com.coforg.basics;

public class SmallestArray {

		public static void main(String[] args) {

			int[] a= {4,3,5,1,7};
			int least=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(a[i]<least)
				{
				least=a[i];
				}
			}
			System.out.println(least);
		}
	}
