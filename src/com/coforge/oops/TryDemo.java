package com.coforge.oops;
/*
public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value "+value);
			int num = Integer.parseInt(value);
			System.out.println("Num "+num);
			int total = 100/num;
			System.out.println("Total "+total);
			int[] marks = null;
			System.out.println("Marks "+marks[2]);
		}
//		catch(Exception e) {
//			System.out.println("Other Exception");
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a value");
		}catch(NumberFormatException e) {
			System.out.println("Please enter a number");
		}catch(ArithmeticException e) {
			System.out.println("Please enter a number greater than zero");
		}catch(Exception e) {
			System.out.println("Other Exception");
		}
		System.out.println("completed");
	}
}
*/
//2
/*
public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value "+value);
			int num = Integer.parseInt(value);
			System.out.println("Num "+num);
			int total = 100/num;
			System.out.println("Total "+total);
			int[] marks = null;
			System.out.println("Marks "+marks[2]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("Please enter a value greater than zero");
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Other Exception");
		}
		System.out.println("completed");
	}
}
*/
//3
/*
public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value "+value);
			int num = Integer.parseInt(value);
			System.out.println("Num "+num);
			int total = 100/num;
			System.out.println("Total "+total);
//			int[] marks = null;
//			System.out.println("Marks "+marks[2]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("Please enter a value greater than zero");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Other Exception");
		}
		finally{
			System.out.println("In Finally block");
			System.out.println("closing resources");
		}
		System.out.println("completed");
	}
}
*/
//4
public class TryDemo {

	public static void main(String[] args) {

		System.out.println("Welcome");
		try {
			String value = args[0];
			System.out.println("Value "+value);
			int num = Integer.parseInt(value);
			System.out.println("Num "+num);
			int total = 100/num;
			System.out.println("Total "+total);
//			int[] marks = null;
//			System.out.println("Marks "+marks[2]);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println("Please enter a value greater than zero");
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Other Exception");
		}
		finally{
			System.out.println("In Finally block");
			System.out.println("closing resources");
		}
		System.out.println("completed");
	}
}