package com.coforg.basics;

public class GreatestArray {

	public static void main(String[] args) {

		int[] a= {4,3,5,1,7};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
			max=a[i];
			}
		}
		System.out.println(max);
	}
}
