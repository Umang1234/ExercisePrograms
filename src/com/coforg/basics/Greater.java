package com.coforg.basics;

public class Greater {

	public static void main(String[] args) {
			
		//ternary 
		int a=10,b=20,c=30,result;
		result = (a>b) ? (a>c ? a:c) : (b>c ? b:c);
		System.out.println("Greater number from" + a + ',' + b + ',' + c + "is" + result);
		
		//if-else
		if (a>b && a>c)
			System.out.println("a is greater");
		else if (b>a && b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
	}

}
