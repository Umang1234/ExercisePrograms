package com.coforg.basics;
import java.util.Scanner;
import java.util.Arrays;

public class Array2Smallest {
		public static void main(String[] args) {
			
			int [] arr = new int[5];
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the elements of the array");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			sc.close();
			Arrays.sort(arr);
			System.out.println(arr[0]);

		}

	}

