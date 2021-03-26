package com.coforg.basics;

public class TwoDimArray {

	public static void main(String[] args) {

		int[][] marks = {{90,80},{70,90}};
		
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(marks[i][j]+"\t");
			}
		}
		System.out.println();
		
		for(int[] row:marks)
			for(int val:row)
				System.out.print(val+"\t");
	}
}
