package com.coforg.basics;
import java.util.Scanner;
import java.util.Arrays;

public class Array2Greatest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int [] arr = new int[sc.nextInt()];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);

	}

}
